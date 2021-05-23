package com.android.githubjobs.data.repository

import android.os.Build
import androidx.annotation.RequiresApi
import com.android.githubjobs.data.mappers.mapToDomain
import com.android.githubjobs.data.remote.IService
import com.android.githubjobs.domain.entities.Jobs
import com.android.githubjobs.domain.repository.IRepository
import javax.inject.Inject

class RepositoryImpl @Inject constructor(private val api: IService) : IRepository {

    @RequiresApi(Build.VERSION_CODES.N)
    override suspend fun getAll(): List<Jobs> {
        return api.getInstance().getAll().map {
            it.mapToDomain()
        }
    }
}