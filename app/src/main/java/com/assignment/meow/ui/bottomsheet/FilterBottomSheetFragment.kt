package com.assignment.meow.ui.bottomsheet

import android.app.Dialog
import android.os.Build
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import com.assignment.meow.data.cat.response.BreedListResponse
import com.assignment.meow.databinding.FilterBottomSheetDialogFragmentBinding
import com.assignment.meow.ui.CatFragment
import com.assignment.meow.ui.CatViewModel
import com.assignment.meow.ui.adapters.BreedsAdapter
import com.google.android.material.bottomsheet.BottomSheetBehavior
import com.google.android.material.bottomsheet.BottomSheetDialog
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class FilterBottomSheetFragment : BottomSheetDialogFragment() {

    private var mBreedsAdapter: BreedsAdapter? = null
    private var mBreedList: BreedListResponse? = null

    companion object {
        private const val TAG = "FilterBottomSheetFragment"

        fun newInstance(
            items: ArrayList<BreedListResponse.BreedListResponseItem>
        ) = FilterBottomSheetFragment().apply {
            arguments = Bundle().apply {
                putParcelableArrayList("items", items)
            }
        }
    }

    interface ShowBreedListInterface {
        fun onBreedSelected(breed: String)
    }

    private var listener: ShowBreedListInterface? = null

    private var mViewBinding: FilterBottomSheetDialogFragmentBinding? = null
    private var dialog: BottomSheetDialog? = null


    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        dialog = super.onCreateDialog(savedInstanceState) as BottomSheetDialog
        return dialog as BottomSheetDialog
    }

    override fun onStart() {
        super.onStart()
        dialog?.behavior?.state = BottomSheetBehavior.STATE_EXPANDED
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        if (parentFragment is CatFragment)
            listener = parentFragment as CatFragment

        mViewBinding = FilterBottomSheetDialogFragmentBinding.inflate(inflater, container, false)
        return mViewBinding?.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        mBreedList = BreedListResponse()
        mBreedList = if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU) {
            arguments?.getParcelable("items", BreedListResponse::class.java)
        } else
            arguments?.getParcelable("items")
        mBreedsAdapter = BreedsAdapter(mBreedList) { item ->
            item.id?.let { it1 -> listener?.onBreedSelected(it1) }
            dialog?.dismiss()
        }
        mViewBinding?.breedsRecyclerView?.adapter = mBreedsAdapter
    }

}