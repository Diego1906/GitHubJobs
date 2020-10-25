package com.android.githubjobs.data.repository

import com.android.githubjobs.data.mapper.mapToDomain
import com.android.githubjobs.data.remote.IRetrofit
import com.android.githubjobs.domain.model.Jobs
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