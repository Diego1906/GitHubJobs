package com.android.githubjobs.domain.usecase

import com.android.githubjobs.domain.entities.Jobs

interface IUseCase {

    suspend fun getAll(): List<Jobs>
}