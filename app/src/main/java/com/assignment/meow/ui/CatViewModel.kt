package com.assignment.meow.ui

import android.content.Context
import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import androidx.paging.PagingData
import androidx.paging.cachedIn
import com.assignment.meow.api.repository.CatRepository
import com.assignment.meow.base.ApiResult
import com.assignment.meow.base.BaseViewModel
import com.assignment.meow.data.cat.response.BreedListResponse
import com.assignment.meow.data.cat.response.CatListResponse
import com.assignment.meow.utils.NO_INTERNET_CONNECTION
import com.assignment.meow.utils.NetworkStatusHelper
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class CatViewModel @Inject constructor(
    private val catRepository: CatRepository
) : BaseViewModel() {

    companion object {
        private const val TAG = "CatViewModel"
    }

    private val _breedList = MutableLiveData<BreedListResponse?>()
    val breedList: LiveData<BreedListResponse?> = _breedList

    fun getCatList(breedId: String? = null): LiveData<PagingData<CatListResponse.CatListResponseItem>> =
        catRepository.getCatPagedData(breedId).cachedIn(viewModelScope)


    fun getBreedList(context: Context) = viewModelScope.launch {
        if (NetworkStatusHelper.isOnline(context)) {
            catRepository.getBreedList().collectLatest {
                when (it) {
                    is ApiResult.Success -> _breedList.postValue(it.data)
                    is ApiResult.Error -> {
                        Log.e(TAG, "getBreedList: ${it.exception.message}")
                        errorMessage.postValue(it.exception.message)
                    }
                    else -> Unit
                }
            }
        } else
            errorMessage.postValue(NO_INTERNET_CONNECTION)
    }

}