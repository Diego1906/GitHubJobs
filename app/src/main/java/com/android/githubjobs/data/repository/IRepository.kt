package com.android.githubjobs.data.repository

import com.android.githubjobs.domain.model.Jobs

interface IRepository {

    suspend fun getByFilter(search: String): List<Jobs>

    suspend fun getAll(): List<Jobs>
}