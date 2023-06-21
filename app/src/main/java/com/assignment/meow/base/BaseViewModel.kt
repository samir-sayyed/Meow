package com.assignment.meow.base

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

open class BaseViewModel: ViewModel(){
    // error message
    val errorMessage by lazy { MutableLiveData<String>() }

}