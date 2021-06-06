package com.android.githubjobs.data.repository

import com.android.githubjobs.data.dto.JobsResult
import com.android.githubjobs.domain.entities.Jobs

class MockRepository(private val result: JobsResult) {

    fun getAll(): List<Jobs> {
        return (result as JobsResult.Success).jobs
    }
}