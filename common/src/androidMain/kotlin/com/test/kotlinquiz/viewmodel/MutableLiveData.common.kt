package com.test.kotlinquiz.viewmodel

import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.Observer
import androidx.lifecycle.MutableLiveData as DroidMutableLiveData

actual typealias MutableLiveData<T> = DroidMutableLiveData<T>

fun <T> DroidMutableLiveData<T>.observe(owner: LifecycleOwner, callback: (T) -> Unit) {
    observe(owner, Observer { value ->
        callback(value as T)
    })
}
