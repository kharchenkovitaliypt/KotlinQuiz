package com.test.kotlinquiz.coroutines

expect suspend inline fun <reified T, reified R> suspendJob(
    noinline producer: () -> T,
    crossinline job: (T) -> R
): R

suspend inline fun <reified R> suspendJob(
    crossinline job: (Unit) -> R
): R {
    return suspendJob({}, job)
}