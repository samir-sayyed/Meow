package com.assignment.meow.api

import com.assignment.meow.data.cat.response.BreedListResponse
import com.assignment.meow.data.cat.response.CatListResponse
import com.assignment.meow.utils.API_KEY
import com.assignment.meow.utils.BREED_LIST_END_POINT
import com.assignment.meow.utils.CAT_LIST_END_POINT
import retrofit2.http.GET
import retrofit2.http.Query

interface MeowService {

    @GET(CAT_LIST_END_POINT)
    suspend fun getCatList(
        @Query("limit") limit: Int,
        @Query("order") order: String = "Desc",
        @Query("page") page: Int,
        @Query("api_key") apiKey: String = API_KEY
    ): CatListResponse

    @GET(CAT_LIST_END_POINT)
    suspend fun getCatListByBreed(
        @Query("breed_ids") breedId: String,
        @Query("limit") limit: Int,
        @Query("api_key") apiKey: String = API_KEY
    ): CatListResponse

    @GET(BREED_LIST_END_POINT)
    suspend fun getBreedList(): BreedListResponse
}