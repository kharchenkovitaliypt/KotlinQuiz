package com.test.kotlinquiz.viewmodel

actual open class MutableLiveData<T> actual constructor(data: T?) {

    private var _data: T? = null
    private var isInitialized = false
    init {
        data?.let {
            this._data = it
            this.isInitialized = true
        }
    }
    private val callbackList = mutableListOf<(T) -> Unit>()

    actual var data: T
        @Suppress("UNCHECKED_CAST")
        get() = this._data as T

        set(value) {
            this._data = value
            this.isInitialized = true
            callbackList.forEach { it(value) }
        }

    fun observe(callback: (T) -> Unit) {
        callbackList += callback
        if (isInitialized) {
            callback.invoke(data)
        }
    }
}