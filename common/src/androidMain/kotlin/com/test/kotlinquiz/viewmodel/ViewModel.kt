package com.test.kotlinquiz.viewmodel

actual open class ViewModel : androidx.lifecycle.ViewModel() {

    actual override fun onCleared() {
        super.onCleared()
    }
}