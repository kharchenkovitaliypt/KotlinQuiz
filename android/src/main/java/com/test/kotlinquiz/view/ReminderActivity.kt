package com.test.kotlinquiz.view

import android.content.Context
import android.net.Uri
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.work.OneTimeWorkRequest
import androidx.work.WorkManager
import androidx.work.Worker
import androidx.work.WorkerParameters
import com.idapgroup.tnt.takePhotoFromCamera
import com.soywiz.klock.DateTime
import com.test.kotlinquiz.R
import com.test.kotlinquiz.data.Reminder
import com.test.kotlinquiz.service.ReminderService
import com.test.kotlinquiz.service.createDb
import com.test.kotlinquiz.viewmodel.ReminderViewModel
import com.test.kotlinquiz.viewmodel.observe
import kotlinx.android.synthetic.main.activity_reminders.view.*
import java.time.Duration
import java.util.concurrent.TimeUnit

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
            startWorkManager(list.filter { !it.isDone })
        }

        view.recyclerView.adapter = reminderAdapter
    }

    private fun startWorkManager(list: List<Reminder>) {

        list.forEach {

            val currTime = DateTime.now()
            var time = DateTime.invoke(currTime.year, currTime.month, currTime.dayOfMonth)
            time = time.plus(it.notifyTime)

            val worker = OneTimeWorkRequest.Builder(ClearingWorker::class.java)
                .setInitialDelay(time.minus(currTime).minutes.toLong(), TimeUnit.MINUTES)
                .build()

            WorkManager.getInstance(this).enqueue(worker)
        }
    }

    private fun takePhoto(reminder: Reminder) { // must be actual
        clickedReminder = reminder
        takePhotoFromCamera(::saveToDb)
    }

    private fun saveToDb(image: Uri) {
        viewModel.saveDoneTask(clickedReminder, image)
    }

    fun makeToast() {
        Toast.makeText(this, "start worker", Toast.LENGTH_SHORT).show()
    }

}

private class ReminderViewModelFactory : ViewModelProvider.Factory {

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel?> create(modelClass: Class<T>): T
            = ReminderViewModel(ReminderService(createDb())) as T
}

class ClearingWorker(context: Context, params: WorkerParameters): Worker(context, params) {
    override fun doWork(): Result {

        Log.d("ClearingWorker", "start worker")

        return Result.success()
    }

}