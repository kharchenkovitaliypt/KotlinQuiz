package com.test.kotlinquiz.viewmodel

expect open class MutableLiveData<T : Any>() {
    fun setValue(value: T)
    fun getValue(): T?
}

fun <T : Any> MutableLiveData<T>.value(): T? = getValue()

fun <T : Any> MutableLiveData<T>.value(value: T) = setValue(value)
