package com.test.kotlinquiz.data

import com.soywiz.klock.DateTime
import com.soywiz.klock.hours
import com.soywiz.klock.minutes

val defaultReminders = listOf(
    ReminderImpl(
        id = "0",
        title = "Close gas",
        isDone = false,
        notifyTime = 8.hours + 28.minutes,
        photo = null
    ),
    ReminderImpl(
        id = "1",
        title = "Turn off clothes iron",
        isDone = false,
        notifyTime = 8.hours + 30.minutes,
        photo = null
    ),
    ReminderImpl(
        id = "2",
        title = "Close windows",
        isDone = false,
        notifyTime = 8.hours + 35.minutes,
        photo = null
    ),
    ReminderImpl(
        id = "3",
        title = "Lock the door",
        isDone = false,
        notifyTime = 12.hours,
        photo = null
    ),
    ReminderImpl(
        id = "4",
        title = "Feed the pet",
        isDone = false,
        notifyTime = 21.hours,
        photo = null
    )
)