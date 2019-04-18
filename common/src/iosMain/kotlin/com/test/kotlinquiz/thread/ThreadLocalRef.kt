package com.test.kotlinquiz.thread

import co.touchlab.stately.concurrency.AtomicBoolean
import kotlin.native.concurrent.freeze

@ThreadLocal
private val threadLocalMap = HashMap<ThreadLocalRef<*>, Any?>()

class ThreadLocalRef<T> private constructor() {

    companion object {
        fun <T> of(value: T) = ThreadLocalRef<T>().apply {
            value?.let(::set)
            freeze()
        }
    }

    private val released = AtomicBoolean(false)

    private val isReleased: Boolean get() = released.value

    @Suppress("UNCHECKED_CAST")
    fun get(): T {
        assertNotReleased()
        return threadLocalMap[this] as T
    }

    fun set(value: T) {
        assertNotReleased()
        if (value != null) {
            threadLocalMap[this] = value
        } else {
            threadLocalMap.remove(this)
        }
    }

    fun release() {
        released.value = true
    }

    private fun assertNotReleased() {
        if (isReleased) {
            throw RuntimeException("It is released")
        }
    }
}

fun <T> ThreadLocalRef<T>.getAndSet(value: T): T {
    val current = get()
    set(value)
    return current
}

fun <T> ThreadLocalRef<T>.getAndRelease(): T {
    val current = get()
    release()
    return current
}
