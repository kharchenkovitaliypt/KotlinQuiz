package com.test.kotlinquiz.viewmodel

import androidx.lifecycle.Observer as AObserver
import androidx.lifecycle.MutableLiveData as AMutableLiveData
import androidx.lifecycle.LifecycleOwner as ALifecycleOwner

actual class MutableLiveData<T> actual constructor(value: T?) : AMutableLiveData<T>() {

    init {
        value?.let(::setValue)
    }

    actual fun observe(owner: LifecycleOwner, callback: (T) -> Unit) {
        super.observe(owner as ALifecycleOwner, callback.toObserver())
    }

    actual fun observe(callback: (T) -> Unit) {
        super.observeForever(callback.toObserver())
    }
}

private fun <T> ((T) -> Unit).toObserver(): AObserver<T>
    = AObserver { value -> invoke(value) }