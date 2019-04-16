package com.test.kotlinquiz.utils

@ThreadLocal
private val threadLocalMap = HashMap<ThreadLocalRef<*>, Any>()

@ThreadLocal
class ThreadLocalRef<T>() {

    constructor(value: T): this() {
        set(value)
    }

    @Suppress("UNCHECKED_CAST")
    fun get(): T? = threadLocalMap[this] as T?

    fun set(value: T?) {
        if (value == null) {
            remove()
        } else {
            threadLocalMap[this] = value
        }
    }

    fun remove() {
        threadLocalMap.remove(this)
    }
}