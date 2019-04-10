package com.test.kotlinquiz.viewmodel

import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.Observer as AObserver
import androidx.lifecycle.MutableLiveData as AMutableLiveData

actual open class MutableLiveData<T> actual constructor(data: T?) : AMutableLiveData<T>() {
    init {
        data?.let(::setValue)
    }

    @Suppress("UNCHECKED_CAST")
    actual var data: T
        get() = value as T
        set(value) = super.setValue(value)
}

fun <T> MutableLiveData<T>.observe(owner: LifecycleOwner, callback: (T) -> Unit) {
    observe(owner, AObserver { value -> callback(value) })
}
