package com.android.githubjobs.presentation.viewholder

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.android.githubjobs.databinding.ItemListJobsBinding
import com.android.githubjobs.domain.entities.Jobs

class JobsVieWHolder private constructor(private val binding: ItemListJobsBinding) :
    RecyclerView.ViewHolder(binding.root) {

    fun bind(jobs: Jobs) {
        binding.run {
            this.jobs = jobs
            executePendingBindings()
        }
    }

    companion object {
        fun from(parent: ViewGroup): JobsVieWHolder {
            val view = ItemListJobsBinding.inflate(
                LayoutInflater.from(parent.context), parent, false
            )
            return JobsVieWHolder(view)
        }
    }
}