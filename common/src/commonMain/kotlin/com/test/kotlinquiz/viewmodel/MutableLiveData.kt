package com.test.kotlinquiz.viewmodel

typealias LifecycleOwner = Any

expect class MutableLiveData<T>(value: T? = null) {

    fun setValue(value: T?)
    fun getValue(): T?

    fun observe(owner: LifecycleOwner, callback: (T) -> Unit)
    fun observe(callback: (T) -> Unit)
}

var <T> MutableLiveData<T>.value: T?
    get() = getValue()
    set(value) { setValue(value) }