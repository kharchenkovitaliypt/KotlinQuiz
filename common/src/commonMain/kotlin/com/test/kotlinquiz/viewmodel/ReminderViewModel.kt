package com.test.kotlinquiz.viewmodel

import com.test.kotlinquiz.data.Reminder
import com.test.kotlinquiz.service.ReminderService
import kotlinx.coroutines.launch

class ReminderViewModel (
    private val reminderService: ReminderService
) : CoroutineViewModel() {

    init {
        getDoneTasks()
    }

    var remindersList : MutableLiveData<List<Reminder>> = MutableLiveData()

    fun saveDoneTask(reminder: Reminder) = launch {
        reminderService.saveDoneTask(reminder)

        getDoneTasks()
    }

    private fun getDoneTasks() = launch {
        remindersList.setValue(reminderService.getDoneTasks())
    }

    fun deleteAllTasks() = launch {
        reminderService.deleteAllTasks()

        getDoneTasks()
    }
}