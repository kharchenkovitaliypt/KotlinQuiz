package com.test.kotlinquiz.viewmodel

actual abstract class ViewModel : androidx.lifecycle.ViewModel() {

    actual override fun onCleared() {
        super.onCleared()
    }
}