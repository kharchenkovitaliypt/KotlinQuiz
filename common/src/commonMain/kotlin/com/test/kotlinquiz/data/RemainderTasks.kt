package com.test.kotlinquiz.data

enum class RemainderTasks(taskTitle: String) {
    CLOSE_GAS("Close gas"),
    TURN_OFF_CLOTHES_IRON("Turn off clothes iron"),
    CLOSE_WINDOWS("Close windows"),
    LOCK_THE_DOOR("Lock the door");

    fun getTitle(): String {
        return this.name
    }
}