package com.test.kotlinquiz.data

interface Reminder {
    val id: ID
    val photoUrl: String
    val isDone: Boolean
    val eventName: String
    val createAt: Long
}