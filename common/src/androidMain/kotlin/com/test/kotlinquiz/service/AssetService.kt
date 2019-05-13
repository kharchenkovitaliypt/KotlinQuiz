package com.test.kotlinquiz.service

import android.content.res.AssetManager
import com.test.kotlinquiz.coroutines.suspendJob

class AssetServiceImpl (
    private val assetManager: AssetManager
): AssetService {
    override suspend fun fetch(name: String): String = suspendJob {
        assetManager.open(name)
            .bufferedReader()
            .use { it.readText() }
    }
}