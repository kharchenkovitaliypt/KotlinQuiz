package com.test.kotlinquiz.viewmodel

expect abstract class ViewModel() {
    protected open fun onCleared()
}