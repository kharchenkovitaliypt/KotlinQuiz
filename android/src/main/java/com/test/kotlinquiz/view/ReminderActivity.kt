package com.test.kotlinquiz.view

import android.net.Uri
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.idapgroup.tnt.takePhotoFromCamera
import com.test.kotlinquiz.R
import com.test.kotlinquiz.data.Reminder
import com.test.kotlinquiz.service.ReminderService
import com.test.kotlinquiz.service.createDb
import com.test.kotlinquiz.viewmodel.ReminderViewModel
import com.test.kotlinquiz.viewmodel.observe
import kotlinx.android.synthetic.main.activity_reminders.view.*

class ReminderActivity : AppCompatActivity() {
    lateinit var viewModel: ReminderViewModel

    private val view: View get() = findViewById(android.R.id.content)
    private lateinit var clickedReminder: Reminder

    private val reminderAdapter =  ReminderAdapter { reminder -> takePhoto(reminder)}

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_reminders)

        viewModel = ViewModelProvider(this, ReminderViewModelFactory())
            .get(ReminderViewModel::class.java)

        viewModel.remindersList.observe(this) { list ->
            reminderAdapter.addItems(list)
        }

        view.recyclerView.adapter = reminderAdapter
    }

    private fun takePhoto(reminder: Reminder) { // must be actual
        clickedReminder = reminder
        takePhotoFromCamera(::saveToDb)
    }

    private fun saveToDb(image: Uri) {
        viewModel.saveDoneTask(clickedReminder, image)
    }
}

private class ReminderViewModelFactory : ViewModelProvider.Factory {

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel?> create(modelClass: Class<T>): T
            = ReminderViewModel(ReminderService(createDb())) as T
}