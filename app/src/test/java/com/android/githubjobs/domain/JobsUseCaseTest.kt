package com.android.githubjobs.domain

import com.android.githubjobs.data.repository.MockRepository
import com.android.githubjobs.domain.entities.Jobs

class JobsUseCaseTest(private val repository: MockRepository) {

    fun getAll(): List<Jobs> = repository.getAll()
}