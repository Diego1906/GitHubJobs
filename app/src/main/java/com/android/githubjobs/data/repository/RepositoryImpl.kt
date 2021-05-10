package com.android.githubjobs.data.repository

import com.android.githubjobs.data.mappers.mapToDomain
import com.android.githubjobs.data.remote.IRetrofit
import com.android.githubjobs.domain.entities.Jobs
import com.android.githubjobs.domain.repository.IRepository
import javax.inject.Inject

class RepositoryImpl @Inject constructor(private val api: IRetrofit) : IRepository {

    override suspend fun getByFilter(search: String): List<Jobs> {
        return api.getInstance().getByFilter(search).map {
            it.mapToDomain()
        }
    }

    override suspend fun getAll(): List<Jobs> {
        return api.getInstance().getAll().map {
            it.mapToDomain()
        }
    }
}