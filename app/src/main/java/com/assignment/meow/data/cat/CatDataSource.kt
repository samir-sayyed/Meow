package com.assignment.meow.data.cat

import com.assignment.meow.api.MeowService
import javax.inject.Inject

class CatDataSource @Inject constructor(private val meowService: MeowService) {

    /**
     * suspend function to get cat list
     * @param limit
     * @param page
     * @return CatListResponse
     */
    suspend fun getCatList(limit: Int, page:Int) =
        meowService.getCatList(limit = limit, page = page)


    /**
     * suspend function to get cat list by breed
     * @param breedId
     * @param limit
     * @return CatListResponse
     */
    suspend fun getCatListByBreed(breedId: String, limit: Int) =
        meowService.getCatListByBreed(breedId = breedId, limit = limit )


    /**
     * suspend function to get breed list
     *@return breed list response
     */
    suspend fun getBreedList() = meowService.getBreedList()

}