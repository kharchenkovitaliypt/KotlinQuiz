package com.test.kotlinquiz.coroutines

expect suspend inline fun <P, R> suspendJob(
    crossinline producer: () -> P,
    crossinline job: (P) -> R
): R

suspend inline fun <R> suspendJob(
    crossinline job: (Unit) -> R
): R {
    return suspendJob({}, job)
}