package com.android.githubjobs.data.repository

import com.android.githubjobs.domain.models.Jobs

interface IRepository {

    suspend fun getByFilter(search: String): List<Jobs>
    suspend fun getAll(): List<Jobs>
}