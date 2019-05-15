package com.test.kotlinquiz.viewmodel

expect open class MutableLiveData<T>() {
    fun setValue(value: T)
    fun getValue(): T?
}

fun <T> MutableLiveData<T>.value(): T? = getValue()

fun <T> MutableLiveData<T>.value(value: T) = setValue(value)
