package com.assignment.meow

import android.content.Context
import android.util.Log
import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import com.assignment.meow.utils.NetworkStatusHelper
import io.mockk.every
import io.mockk.impl.annotations.MockK
import io.mockk.junit4.MockKRule
import io.mockk.mockkObject
import io.mockk.mockkStatic
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.test.TestDispatcher
import kotlinx.coroutines.test.UnconfinedTestDispatcher
import kotlinx.coroutines.test.resetMain
import kotlinx.coroutines.test.setMain
import org.junit.After
import org.junit.Before
import org.junit.Rule

@OptIn(ExperimentalCoroutinesApi::class)
abstract class BaseTest {

    @get:Rule
    val mockkRule = MockKRule(this)

    @Rule
    @JvmField
    val rule = InstantTaskExecutorRule()

    @MockK
    lateinit var mContextMock: Context

    val dispatcher: TestDispatcher = UnconfinedTestDispatcher()

    @Before
    open fun init() {
        Dispatchers.setMain(dispatcher)
        every { mContextMock.applicationContext }.returns(mContextMock)
        mockkStatic(Log::class)
        every { Log.e(any(), any()) }.returns(0)
        mockkObject(NetworkStatusHelper)
        every { NetworkStatusHelper.isOnline(mContextMock) }.returns(true)
    }

    @After
    open fun tearDown() {
        Dispatchers.resetMain()
    }

}