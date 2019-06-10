package com.test.kotlinquiz.data

import com.soywiz.klock.TimeSpan

data class ReminderImpl(
    override val id: ID,
    override val photo: Uri?,
    override val isDone: Boolean,
    override val title: String,
    override val notifyTime: TimeSpan
) : Reminder