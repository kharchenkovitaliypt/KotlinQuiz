package com.test.kotlinquiz.data

import com.test.kotlinquiz.service.ReminderImpl

//enum class RemainderType(val title: String) {
//    CLOSE_GAS("Close gas"),
//    TURN_OFF_CLOTHES_IRON("Turn off clothes iron"),
//    CLOSE_WINDOWS("Close windows"),
//    LOCK_THE_DOOR("Lock the door");
//}

val reminders = listOf(
    ReminderImpl(
        id = "0",
        title = "Close gas"
    )
)