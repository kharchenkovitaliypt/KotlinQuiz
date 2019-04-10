package com.test.kotlinquiz.viewmodel

expect open class MutableLiveData<T>(data: T? = null) {
    var data: T
}