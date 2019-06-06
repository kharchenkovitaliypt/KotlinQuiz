package com.test.kotlinquiz.service

import com.test.kotlinquiz.KotlinQuizDb
import com.test.kotlinquiz.coroutines.suspendJob
import com.test.kotlinquiz.data.Reminder
import com.test.kotlinquiz.data.Uri
import com.test.kotlinquiz.data.reminders

class ReminderService(private val db: KotlinQuizDb) {

    private val dbService = DbService()

    suspend fun saveDoneTask(reminder: Reminder, image: Uri) {
        dbService.insertReminder(reminder)
    }

    suspend fun deleteAllTasks() = suspendJob {
        db.dbReminderQueries.clearAll()
//        dbService.deleteAll()
    }

    suspend fun getDoneTasks(): List<Reminder> {
        val list = db.dbReminderQueries.selectAll().executeAsList()
        if (list.isEmpty()) {
            db.transaction {
                reminders.forEach {
                    db.dbReminderQueries.insert(it)
                }
            }
            return reminders
        }

        return list.map { }
    }
}