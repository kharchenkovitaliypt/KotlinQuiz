package com.test.kotlinquiz.service

import android.content.res.AssetManager
import kotlinx.io.core.Input
import kotlinx.io.streams.asInput

actual class AssetService(
    private val assetManager: AssetManager
) {
    actual suspend fun fetch(name: String): String {
        return assetManager.open(name)
            .bufferedReader()
            .use { it.readText() }
    }
}