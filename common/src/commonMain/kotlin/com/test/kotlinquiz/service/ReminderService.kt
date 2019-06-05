package com.test.kotlinquiz.service

import com.test.kotlinquiz.data.Reminder

class ReminderService {

    private val dbService = DbService()

    suspend fun saveDoneTask(reminder: Reminder) {
        dbService.insertReminder(reminder)
    }

    suspend fun deleteAllTasks() {
        dbService.deleteAll()
    }

    suspend fun getDoneTasks(): List<Reminder> {
        return dbService.getReminders()
    }
}