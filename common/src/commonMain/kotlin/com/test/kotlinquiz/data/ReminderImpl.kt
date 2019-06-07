package com.test.kotlinquiz.data

import com.soywiz.klock.DateTime

data class ReminderImpl(
    override val id: ID,
    override val photo: Uri?,
    override val isDone: Boolean,
    override val title: String,
    override val notifyTime: DateTime
) : Reminder