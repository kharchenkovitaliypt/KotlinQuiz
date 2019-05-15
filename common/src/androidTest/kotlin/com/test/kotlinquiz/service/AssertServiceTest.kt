@file:Suppress("MemberVisibilityCanBePrivate")

package com.test.kotlinquiz.service

import android.content.Context
import androidx.test.core.app.ApplicationProvider
import kotlinx.coroutines.runBlocking
import kotlin.test.Test
import kotlin.test.assertEquals

private const val expectData = """{
  "text": "value",
  "number": 45,
  "boolean": true
}"""

class AssertServiceTest {

    val context: Context get() = ApplicationProvider.getApplicationContext()
    val assetService by lazy { AssetServiceImpl(context.assets) }

    @Test fun testFetchAssetByName() = runBlocking {
        val actualData = assetService.fetch("test-data.json")
        assertEquals(expectData, actualData)
    }
}