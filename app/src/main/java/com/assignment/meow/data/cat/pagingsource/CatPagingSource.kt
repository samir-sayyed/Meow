package com.assignment.meow.data.cat.pagingsource

import android.util.Log
import androidx.paging.PagingSource
import androidx.paging.PagingState
import com.assignment.meow.data.cat.CatDataSource
import com.assignment.meow.data.cat.response.CatListResponse


class CatPagingSource(
    private val catDataSource: CatDataSource,
    private val breedId: String? = null
) : PagingSource<Int, CatListResponse.CatListResponseItem>() {

    override fun getRefreshKey(state: PagingState<Int, CatListResponse.CatListResponseItem>): Int? {
        return state.anchorPosition?.let { anchorPosition ->
            state.closestPageToPosition(anchorPosition)?.prevKey?.plus(1)
                ?: state.closestPageToPosition(anchorPosition)?.nextKey?.minus(1)
        }
    }

    override suspend fun load(params: LoadParams<Int>): LoadResult<Int, CatListResponse.CatListResponseItem> {
        val page = params.key ?: 1
        val pageSize = params.loadSize
        return try {
            val response =
                if (breedId.isNullOrEmpty()) catDataSource.getCatList(limit = pageSize, page = page)
                else catDataSource.getCatListByBreed(breedId, limit = pageSize)

            val nextKey = if (response.isEmpty() || !breedId.isNullOrEmpty()) null else page + 1

            LoadResult.Page(
                data = response, prevKey = if (page == 1) null else page - 1,
                nextKey = nextKey
            )

        } catch (e: Exception) {
            Log.e("CatPagingSource", "load: ${e.message}")
            LoadResult.Error(e)
        }
    }

}