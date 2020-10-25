package com.android.githubjobs.domain.usecase

import com.android.githubjobs.data.repository.IRepository
import com.android.githubjobs.domain.model.Jobs

class UseCaseImpl(private val repository: IRepository) : IUseCase {

    override suspend fun getByFilter(search: String): List<Jobs> = repository.getByFilter(search)

    override suspend fun getAll(): List<Jobs> = repository.getAll()
}