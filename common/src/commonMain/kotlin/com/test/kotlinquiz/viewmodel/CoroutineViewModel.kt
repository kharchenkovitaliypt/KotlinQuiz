package com.test.kotlinquiz.viewmodel

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlin.coroutines.CoroutineContext

expect open class ViewModel() {
    protected open fun onCleared()
}

open class CoroutineViewModel : ViewModel(), CoroutineScope {

    private val uiContext = Dispatchers.Main
    private val job = Job()
    // private val exceptionHandler = CoroutineExceptionHandler { _, error ->  showError(error) }

    override val coroutineContext: CoroutineContext
            get() = uiContext + job // + exceptionHandler

    override fun onCleared() {
        job.cancel()
        super.onCleared()
    }
}