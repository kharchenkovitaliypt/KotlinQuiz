package com.test.kotlinquiz.service

expect class AssetService {

    suspend fun fetch(name: String): String
}