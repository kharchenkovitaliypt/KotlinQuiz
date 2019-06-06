package com.test.kotlinquiz.data

import com.soywiz.klock.DateTime

interface Reminder {
    val id: ID
    val photo: Uri?
    val isDone: Boolean
    val title: String
    val notifyTime: DateTime
}