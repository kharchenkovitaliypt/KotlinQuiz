package com.test.kotlinquiz.view

import android.net.Uri
import android.os.Bundle
import android.view.View
import android.widget.CheckedTextView
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatCheckedTextView
import androidx.core.content.ContextCompat
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.idapgroup.tnt.takePhotoFromCamera
import com.test.kotlinquiz.R
import com.test.kotlinquiz.data.RemainderTasks
import com.test.kotlinquiz.data.Reminder
import com.test.kotlinquiz.service.ReminderImpl
import com.test.kotlinquiz.service.ReminderService
import com.test.kotlinquiz.thread.threadSleep
import com.test.kotlinquiz.viewmodel.ReminderViewModel
import com.test.kotlinquiz.viewmodel.observe
import kotlinx.android.synthetic.main.activity_reminders.view.*
import java.util.*

class ReminderActivity : AppCompatActivity() {
    lateinit var viewModel: ReminderViewModel

    private val view: View get() = findViewById(android.R.id.content)
    private var clickedView: String = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_reminders)

        viewModel = ViewModelProvider(this, ReminderViewModelFactory())
            .get(ReminderViewModel::class.java)

        viewModel.remindersList.observe(this) { list ->
            if (list.isNullOrEmpty()) {
                markIsNotDone()
            } else {
                list.forEach { markTaskIsDone(it) }
            }
        }


        view.reminderField1.setOnClickListener { takePhoto(view.reminderField1.text.toString()) }
        view.reminderField2.setOnClickListener { takePhoto(view.reminderField2.text.toString()) }
        view.reminderField3.setOnClickListener { takePhoto(view.reminderField3.text.toString()) }
        view.reminderField4.setOnClickListener { takePhoto(view.reminderField4.text.toString()) }

        setReminderTitle()
    }

    private fun markTaskIsDone(reminder: Reminder) {
        when(reminder.id) {
            view.reminderField1.text.toString() -> { saveViewState(reminder, view.reminderField1, view.photo1) }
            view.reminderField2.text.toString() -> { saveViewState(reminder, view.reminderField2, view.photo2) }
            view.reminderField3.text.toString() -> { saveViewState(reminder, view.reminderField3, view.photo3) }
            view.reminderField4.text.toString() -> { saveViewState(reminder, view.reminderField4, view.photo4) }
        }
    }

    private fun markIsNotDone() {
        view.reminderField1.isChecked = false
        view.reminderField2.isChecked = false
        view.reminderField3.isChecked = false
        view.reminderField4.isChecked = false
        view.reminderField1.isClickable = true
        view.reminderField2.isClickable = true
        view.reminderField3.isClickable = true
        view.reminderField4.isClickable = true
        view.photo1.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.ic_launcher_background))
        view.photo2.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.ic_launcher_background))
        view.photo3.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.ic_launcher_background))
        view.photo4.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.ic_launcher_background))
    }

    private fun takePhoto(id: String) { // must be actual
        clickedView = id
        takePhotoFromCamera(::saveToDb)
    }

    private fun saveToDb(imageUri: Uri) {
        viewModel.saveDoneTask(ReminderImpl(
            id = clickedView,
            createAt = System.currentTimeMillis(),
            eventName = clickedView,
            isDone = true,
            photoUrl = imageUri.toString()
        ))
    }

    private fun saveViewState(reminder: Reminder, viewChecked: CheckedTextView, viewPhoto: ImageView) {
        viewChecked.isChecked = true
        viewChecked.isClickable = false
        viewPhoto.setImageURI(Uri.parse(reminder.photoUrl))
        viewPhoto.isClickable = false

    }

    private fun setReminderTitle() { // must be actual
        view.reminderField1.text = RemainderTasks.values()[0].getTitle()
        view.reminderField2.text = RemainderTasks.values()[1].getTitle()
        view.reminderField3.text = RemainderTasks.values()[2].getTitle()
        view.reminderField4.text = RemainderTasks.values()[3].getTitle()
    }

    private fun deleteAll() {
        val currentTime = System.currentTimeMillis()
        val taskTime = viewModel.remindersList.value?.get(0)?.createAt

        threadSleep(30000)

        if (taskTime != null && taskTime < currentTime) {
            viewModel.deleteAllTasks()
        }
    }
}

private class ReminderViewModelFactory : ViewModelProvider.Factory {

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel?> create(modelClass: Class<T>): T
            = ReminderViewModel(ReminderService()) as T
}