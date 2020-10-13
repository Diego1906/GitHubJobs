package com.android.githubjobs.domain.usecase

import com.android.githubjobs.domain.models.Jobs

interface IUseCase {

    suspend fun getByFilter(search: String): List<Jobs>

    suspend fun getAll(): List<Jobs>
}