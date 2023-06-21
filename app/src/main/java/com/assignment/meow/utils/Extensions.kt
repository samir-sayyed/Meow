package com.assignment.meow.utils

import android.view.View
import com.google.android.material.snackbar.Snackbar

/**
 * Extension function to show snack bar
 * @param message
 */

fun View.snackBar(message: String) {
    Snackbar.make(
        this,
        message,
        Snackbar.LENGTH_LONG
    ).show()
}