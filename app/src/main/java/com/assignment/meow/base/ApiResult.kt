package com.assignment.meow.base

/**
 * A generic class that holds a value with its loading response status.
 * @param <T>
 */
sealed class ApiResult<out T : Any> {

    data class Success<out T : Any>(val data: T?) : ApiResult<T>()
    data class Error<T : Any>(val exception: Exception, val data: T? = null) : ApiResult<T>()
    data class Loading<T : Any>(val t: T? = null) : ApiResult<T>()

    override fun toString(): String {
        return when (this) {
            is Success<*> -> "Success[data=$data]"
            is Error -> "Error[exception=$exception]"
            else -> ""
        }
    }
}