package com.test.kotlinquiz.viewmodel

import com.test.kotlinquiz.data.Reminder
import com.test.kotlinquiz.data.Uri
import com.test.kotlinquiz.service.ReminderService
import kotlinx.coroutines.launch

class ReminderViewModel (
    private val reminderService: ReminderService
) : CoroutineViewModel() {

    init {
        launch {
            getDoneTasks()
        }
    }

    val remindersList = MutableLiveData<List<Reminder>>()

    fun saveDoneTask(reminder: Reminder, image: Uri) = launch {
        reminderService.saveDoneTask(reminder, image)

        getDoneTasks()
    }

    private suspend fun getDoneTasks() {
        remindersList.setValue(reminderService.getDoneTasks())
    }
}