package com.assignment.meow.ui

import android.util.Log
import android.view.View
import androidx.paging.LoadState
import com.assignment.meow.R
import com.assignment.meow.base.BaseFragment
import com.assignment.meow.data.cat.response.BreedListResponse
import com.assignment.meow.databinding.FragmentCatBinding
import com.assignment.meow.ui.adapters.CatPagingAdapter
import com.assignment.meow.ui.adapters.LoaderAdapter
import com.assignment.meow.ui.bottomsheet.FilterBottomSheetFragment
import com.assignment.meow.utils.EMPTY_STRING
import com.assignment.meow.utils.NO_INTERNET_CONNECTION
import com.assignment.meow.utils.NetworkStatusHelper
import com.assignment.meow.utils.SOMETHING_WENT_WRONG
import com.assignment.meow.utils.snackBar
import com.facebook.shimmer.ShimmerFrameLayout
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class CatFragment : FilterBottomSheetFragment.ShowBreedListInterface,
    BaseFragment<FragmentCatBinding, CatViewModel>() {

    companion object {
        private const val TAG = "CatFragment"
    }

    private var mFilterBottomSheetDialogFragment: FilterBottomSheetFragment? = null

    private var mCatAdapter: CatPagingAdapter? = null
    private var mCatsShimmer: ShimmerFrameLayout? = null
    private var mBreedList: BreedListResponse? = null

    override fun setUpViews() {
        super.setUpViews()
        mCatsShimmer = viewBinding?.catsShimmer
        viewBinding?.catRecyclerview?.isMotionEventSplittingEnabled = false
        mCatAdapter = CatPagingAdapter()
        viewBinding?.catRecyclerview?.adapter = mCatAdapter?.withLoadStateFooter(
            footer = LoaderAdapter()
        )
        initListeners()
    }

    override fun observeData() {
        super.observeData()
        viewModel.breedList.observe(viewLifecycleOwner) {
            if (it != null) {
                mBreedList = it
                mBreedList?.sortBy { breed -> breed.name }
                mBreedList?.add(
                    0,
                    BreedListResponse.BreedListResponseItem(name = "All", id = "All")
                )
            }
        }

        viewModel.errorMessage.observe(viewLifecycleOwner) {
            if (it == NO_INTERNET_CONNECTION) {
                viewBinding?.noInternet?.root?.visibility = View.VISIBLE
                viewBinding?.catsContainer?.visibility = View.GONE
            } else {
                view?.snackBar(SOMETHING_WENT_WRONG)
                viewBinding?.noInternet?.root?.visibility = View.GONE
                viewBinding?.catsContainer?.visibility = View.VISIBLE
            }
        }
    }

    private fun initListeners() {
        viewBinding?.filter?.setOnClickListener {
            mFilterBottomSheetDialogFragment = mBreedList?.let { it1 ->
                FilterBottomSheetFragment.newInstance(
                    it1
                )
            }
            mFilterBottomSheetDialogFragment?.isCancelable = true
            mFilterBottomSheetDialogFragment?.show(
                childFragmentManager, TAG
            )
        }

        viewBinding?.noInternet?.retryButton?.setOnClickListener {
            if (NetworkStatusHelper.isOnline(requireContext())) {
                callApi()
                viewBinding?.noInternet?.root?.visibility = View.GONE
                viewBinding?.catsContainer?.visibility = View.VISIBLE
            } else
                view?.snackBar(NO_INTERNET_CONNECTION)
        }

        mCatAdapter?.addLoadStateListener { loadState ->
            if (loadState.refresh is LoadState.Loading) {
                Log.i(TAG, "Loading")
            } else {
                mCatsShimmer?.stopShimmer()
                mCatsShimmer?.visibility = View.GONE
                viewBinding?.catRecyclerview?.visibility = View.VISIBLE
                val errorState = when {
                    loadState.append is LoadState.Error -> loadState.append as LoadState.Error
                    loadState.prepend is LoadState.Error -> loadState.prepend as LoadState.Error
                    loadState.refresh is LoadState.Error -> loadState.refresh as LoadState.Error
                    else -> null
                }
                errorState?.let {
                    Log.e(TAG, it.error.message.toString())
                    viewModel.errorMessage.postValue(it.error.message)
                }
            }
        }
    }

    override fun initApiCalls() {
        super.initApiCalls()
        callApi()
        viewModel.getBreedList(requireContext())
    }

    override fun onBreedSelected(breed: String) {
        val breedName = if (breed == "All") EMPTY_STRING else breed
        viewBinding?.catRecyclerview?.visibility = View.GONE
        mCatsShimmer?.visibility = View.VISIBLE
        mCatsShimmer?.bringToFront()
        mCatsShimmer?.startShimmer()
        callApi(breedName)
    }

    private fun callApi(breed: String? = EMPTY_STRING) {
        if (NetworkStatusHelper.isOnline(requireContext())) {
            viewModel.getCatList(breed).observe(viewLifecycleOwner) {
                if (it != null) {
                    mCatAdapter?.submitData(lifecycle, it)
                    viewBinding?.catRecyclerview?.scrollToPosition(0)
                } else {
                    view?.snackBar(getString(R.string.something_went_wrong))
                }
            }
        } else
            viewModel.errorMessage.postValue(NO_INTERNET_CONNECTION)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        mCatAdapter = null
        mCatsShimmer = null
        mFilterBottomSheetDialogFragment = null
    }

    override fun viewModelClass(): Class<CatViewModel> = CatViewModel::class.java

    override val layoutId = R.layout.fragment_cat


}