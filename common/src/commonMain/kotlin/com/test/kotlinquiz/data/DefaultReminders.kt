package com.test.kotlinquiz.data

import com.soywiz.klock.DateTime

val defaultReminders = listOf(
    ReminderImpl(
        id = "0",
        title = "Close gas",
        isDone = false,
        notifyTime = DateTime.now(),
        photo = null
    ),
    ReminderImpl(
        id = "1",
        title = "Turn off clothes iron",
        isDone = false,
        notifyTime = DateTime.now(),
        photo = null
    ),
    ReminderImpl(
        id = "2",
        title = "Close windows",
        isDone = false,
        notifyTime = DateTime.now(),
        photo = null
    ),
    ReminderImpl(
        id = "3",
        title = "Lock the door",
        isDone = false,
        notifyTime = DateTime.now(),
        photo = null
    ),
    ReminderImpl(
        id = "4",
        title = "Feed the pet",
        isDone = false,
        notifyTime = DateTime.now(),
        photo = null
    )
)