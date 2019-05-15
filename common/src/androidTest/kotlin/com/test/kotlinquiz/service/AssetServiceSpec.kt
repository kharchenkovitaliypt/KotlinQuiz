package com.test.kotlinquiz.service

import android.content.Context
import androidx.test.core.app.ApplicationProvider
import kotlinx.coroutines.runBlocking
import org.spekframework.spek2.Spek
import org.spekframework.spek2.style.specification.describe
import kotlin.test.assertEquals

private const val expectData = """{
  "text": "value",
  "number": 45,
  "boolean": true
}"""

object AssetServiceSpec: Spek({

    val assetService by memoized {
        val ctx: Context = ApplicationProvider.getApplicationContext()
        AssetServiceImpl(ctx.assets)
    }

    describe("AssetService") {
        it("should fetch asset by name") {
            runBlocking {
                val actualData = assetService.fetch("test-data.json")
                assertEquals(expectData, actualData)
            }
        }
    }
})
