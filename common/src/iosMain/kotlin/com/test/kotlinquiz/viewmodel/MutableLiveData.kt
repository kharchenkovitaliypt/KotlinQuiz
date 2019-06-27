@file:Suppress("UNCHECKED_CAST")

package com.test.kotlinquiz.viewmodel

actual open class MutableLiveData<T : Any> {

    private var isInitialized = false
    private var value: T? = null

    private val callbackList = mutableListOf<(T) -> Unit>()

    actual fun setValue(value: T) {
        this.value = value
        this.isInitialized = true
        callbackList.forEach { it(value) }
    }

    actual fun getValue(): T? = value

    fun observe(callback: (T) -> Unit) {
        callbackList += callback
        if (isInitialized) {
            callback.invoke(value!!)
        }
    }
}
