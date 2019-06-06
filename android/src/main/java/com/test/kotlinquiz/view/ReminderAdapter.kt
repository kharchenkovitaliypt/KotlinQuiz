package com.test.kotlinquiz.view

import android.net.Uri
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.test.kotlinquiz.R
import com.test.kotlinquiz.data.Reminder
import kotlinx.android.synthetic.main.reminder_item.view.*

class ReminderAdapter(
    val onClick: (Reminder) -> Unit
) : RecyclerView.Adapter<ReminderAdapter.ReminderViewHolder>() {
    private val items = mutableListOf<Reminder>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ReminderViewHolder {
        return ReminderViewHolder(parent)
    }

    override fun getItemCount(): Int = items.size

    override fun onBindViewHolder(holder: ReminderViewHolder, position: Int) {
        holder.bind(items[position])
    }

    fun addItems(reminders: List<Reminder>) {
        items.clear()
        items.addAll(reminders)
        notifyDataSetChanged()
    }

    inner class ReminderViewHolder(parent: ViewGroup) : RecyclerView.ViewHolder(
        LayoutInflater.from(parent.context).inflate(R.layout.reminder_item, parent, false)) {

        fun bind(item: Reminder) = with(itemView) {

            if (item.photo.isNullOrEmpty()) {
                photo.setImageDrawable(ContextCompat.getDrawable(context, R.drawable.ic_launcher_background))
            } else {
                photo.setImageURI(Uri.parse(item.photo))
            }

            reminderField.text = item.title
            reminderField.isChecked = item.isDone
            reminderField.isClickable = !item.isDone

            this.setOnClickListener {
                onClick.invoke(item)
            }
        }
    }
}