package com.test.kotlinquiz.service

interface AssetService {

    suspend fun fetch(name: String): String
}