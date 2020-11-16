package com.android.githubjobs.presentation.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.android.githubjobs.databinding.ItemListJobsBinding
import com.android.githubjobs.domain.model.Jobs

class JobsAdapter(private val block: (Jobs) -> Unit) :
    ListAdapter<Jobs, JobsAdapter.JobsVieWHolder>(DiffCallback) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): JobsVieWHolder {
        return JobsVieWHolder.from(parent)
    }

    override fun onBindViewHolder(holder: JobsVieWHolder, position: Int) {
        val jobs = getItem(position)
        holder.itemView.setOnClickListener {
            block.invoke(jobs)
        }
        holder.bind(jobs)
    }

    class JobsVieWHolder private constructor(private val binding: ItemListJobsBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(jobs: Jobs) {
            binding.jobs = jobs
            binding.executePendingBindings()
        }

        companion object {
            fun from(parent: ViewGroup): JobsVieWHolder {
                val view = ItemListJobsBinding.inflate(LayoutInflater.from(parent.context))
                return JobsVieWHolder(view)
            }
        }
    }
}

object DiffCallback : DiffUtil.ItemCallback<Jobs>() {
    override fun areItemsTheSame(oldItem: Jobs, newItem: Jobs): Boolean {
        return oldItem == newItem
    }

    override fun areContentsTheSame(oldItem: Jobs, newItem: Jobs): Boolean {
        return oldItem.id == newItem.id && oldItem.createdAt == newItem.createdAt
    }
}


