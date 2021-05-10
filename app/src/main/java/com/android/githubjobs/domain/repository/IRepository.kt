package com.android.githubjobs.domain.repository

import com.android.githubjobs.domain.entities.Jobs

interface IRepository {

    suspend fun getByFilter(search: String): List<Jobs>

    suspend fun getAll(): List<Jobs>
}