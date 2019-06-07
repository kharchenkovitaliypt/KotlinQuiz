package com.test.kotlinquiz.data

expect fun parseUri(text: String): Uri

expect abstract class Uri {

    abstract override fun toString(): String
}