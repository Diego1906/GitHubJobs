package com.android.githubjobs.presentation.adapter

import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import com.android.githubjobs.domain.entities.Jobs
import com.android.githubjobs.presentation.viewholder.JobsVieWHolder

class JobsAdapter(private val action: (Jobs) -> Unit) :
    ListAdapter<Jobs, JobsVieWHolder>(DiffCallback) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): JobsVieWHolder {
        return JobsVieWHolder.from(parent)
    }

    override fun onBindViewHolder(holder: JobsVieWHolder, position: Int) {
        val jobs = getItem(position)
        with(holder) {
            itemView.setOnClickListener { action.invoke(jobs) }
            bind(jobs)
        }
    }

    object DiffCallback : DiffUtil.ItemCallback<Jobs>() {
        override fun areItemsTheSame(oldItem: Jobs, newItem: Jobs): Boolean {
            return oldItem == newItem
        }

        override fun areContentsTheSame(oldItem: Jobs, newItem: Jobs): Boolean {
            return oldItem.id == newItem.id
                    && oldItem.createdAt == newItem.createdAt
                    && oldItem.description.toString() == newItem.description.toString()
        }
    }
}