package com.assignment.meow.api.repository

import androidx.lifecycle.LiveData
import androidx.paging.Pager
import androidx.paging.PagingConfig
import androidx.paging.PagingData
import androidx.paging.liveData
import com.assignment.meow.base.ApiResult
import com.assignment.meow.data.cat.CatDataSource
import com.assignment.meow.data.cat.pagingsource.CatPagingSource
import com.assignment.meow.data.cat.response.BreedListResponse
import com.assignment.meow.data.cat.response.CatListResponse
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import java.lang.Exception
import javax.inject.Inject

class CatRepository @Inject constructor(private val catDataSource: CatDataSource) {

    /**
     * suspend function to get cat list
     * @return live paging data of cats
     */
    fun getCatPagedData(breedId : String? = null): LiveData<PagingData<CatListResponse.CatListResponseItem>> {
        return Pager(
            config = PagingConfig(
                pageSize = 10,
                enablePlaceholders = false,
                initialLoadSize = 10,
                prefetchDistance = 5
            ),
            pagingSourceFactory = {
                CatPagingSource(catDataSource, breedId)
            }
        ).liveData
    }

    /**
     *suspend function to get breed list
     *@return breed list response
     */
    fun getBreedList(): Flow<ApiResult<BreedListResponse>> = flow {
        try {
            emit(ApiResult.Success(catDataSource.getBreedList()))
        }catch (e : Exception){
            emit(ApiResult.Error(e))
        }
    }


}
