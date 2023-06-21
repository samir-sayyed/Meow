package com.assignment.meow.api.repository

import com.assignment.meow.BaseTest
import com.assignment.meow.base.ApiResult
import com.assignment.meow.data.cat.CatDataSource
import com.assignment.meow.data.cat.response.BreedListResponse
import com.assignment.meow.data.cat.response.BreedListResponse.BreedListResponseItem
import io.mockk.coEvery
import io.mockk.coVerify
import io.mockk.impl.annotations.MockK
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.test.runTest
import org.junit.Assert.assertEquals
import org.junit.Test

class CatRepositoryTest : BaseTest() {

    private lateinit var catRepository: CatRepository

    @MockK
    private lateinit var catDataSource: CatDataSource

    override fun init() {
        super.init()
        catRepository = CatRepository(catDataSource)
    }

    @Test
    fun `call getBreedList should return breedListResponse`() {
        runTest {
            val response = BreedListResponse()
            response.add(BreedListResponseItem(name = "turkish"))
            coEvery { catDataSource.getBreedList() }.returns(
                response
            )
            catRepository.getBreedList().collectLatest {
                when (it) {
                    is ApiResult.Success -> {
                        coVerify { catDataSource.getBreedList() }
                        assertEquals(response, it.data)
                    }

                    else -> Unit
                }
            }
        }
    }

    @Test
    fun `verify getBreedList when error`() {
        runTest {
            coEvery { catDataSource.getBreedList() }.throws(RuntimeException("Api call failed error"))
            catRepository.getBreedList().collectLatest {
                when (it) {
                    is ApiResult.Error -> {
                        coVerify { catDataSource.getBreedList() }
                        assertEquals("Api call failed error", it.exception.message)
                    }

                    else -> Unit
                }
            }
        }
    }
}