package com.test.kotlinquiz.service

import kotlinx.io.core.Input

expect class AssetService {

    suspend fun open(path: String): Input
}