package com.android.githubjobs.data.repository

import com.android.githubjobs.data.mapper.mapToDomain
import com.android.githubjobs.data.remote.IApi
import com.android.githubjobs.domain.models.Jobs

class RepositoryImpl(val api: IApi) : IRepository {

    override suspend fun getByFilter(search: String): List<Jobs> {
        return api.getByFilter(search).map {
            it.mapToDomain()
        }
    }

    override suspend fun getAll(): List<Jobs> {
        return api.getAll().map {
            it.mapToDomain()
        }
    }
}