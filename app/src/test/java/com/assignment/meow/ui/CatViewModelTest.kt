package com.assignment.meow.ui

import com.assignment.meow.BaseTest
import com.assignment.meow.api.repository.CatRepository
import com.assignment.meow.base.ApiResult
import com.assignment.meow.data.cat.response.BreedListResponse
import io.mockk.coEvery
import io.mockk.coVerify
import io.mockk.impl.annotations.MockK
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.test.runTest
import org.junit.Assert.assertEquals
import org.junit.Test

class CatViewModelTest : BaseTest() {

    private lateinit var catViewModel: CatViewModel

    @MockK
    lateinit var catRepository: CatRepository

    override fun init() {
        super.init()
        catViewModel = CatViewModel(catRepository)
    }

    @Test
    fun `call getBreedList and validate livedata updated`() {
        runTest {
            val response = BreedListResponse()
            response.add(BreedListResponse.BreedListResponseItem(name = "turkish"))

            val breedListResponse = flow {
                emit(ApiResult.Success(response))
            }

            coEvery { catRepository.getBreedList() }.returns(breedListResponse)
            catViewModel.getBreedList(mContextMock)
            coVerify { catRepository.getBreedList() }
            assertEquals(
                response, catViewModel.breedList.value
            )
        }
    }

    @Test
    fun `call getBreedList and validate error livedata updated or not when error`(){
        runTest {
            val errorFlow = flow {
                emit(ApiResult.Error(java.lang.Exception("error"), data = null))
            }

            coEvery { catRepository.getBreedList() }.returns(errorFlow)
            catViewModel.getBreedList(mContextMock)
            coVerify { catRepository.getBreedList() }
            assertEquals("error", catViewModel.errorMessage.value)

        }
    }

}