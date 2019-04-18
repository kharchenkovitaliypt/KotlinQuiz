package com.test.kotlinquiz.service

import android.content.res.AssetManager
import com.test.kotlinquiz.coroutines.suspendJob

actual class AssetService(
    private val assetManager: AssetManager
) {
    actual suspend fun fetch(name: String): String = suspendJob {
        assetManager.open(name)
            .bufferedReader()
            .use { it.readText() }
    }
}