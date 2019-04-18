package com.test.kotlinquiz.view

import android.app.Application
import com.test.kotlinquiz.service.appContext

class App : Application() {

    override fun onCreate() {
        super.onCreate()
        appContext = this
    }
}