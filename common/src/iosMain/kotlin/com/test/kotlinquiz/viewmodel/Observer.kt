package com.test.kotlinquiz.viewmodel

actual class MutableLiveData<T> actual constructor(value: T?) {

    init {
        value?.let(::setValue)
    }

    actual fun setValue(value: T?) {
        TODO("not implemented")
    }

    actual fun getValue(): T? {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    actual fun observe(owner: LifecycleOwner, callback: (T) -> Unit) {
        TODO("not implemented")
    }

    actual fun observe(callback: (T) -> Unit) {
        TODO("not implemented")
    }
}