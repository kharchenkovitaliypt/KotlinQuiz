package com.test.kotlinquiz.data

actual typealias Uri = android.net.Uri

actual fun parseUri(text: String): Uri = Uri.parse(text)