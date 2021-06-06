package com.android.githubjobs.data.dto

import com.android.githubjobs.domain.entities.Jobs

sealed class JobsResult {
    class Success(val jobs: List<Jobs>) : JobsResult()
    class ApiError(val statusCode: Int, val isTest: Boolean = false) : JobsResult()
    class ServerError(val isTest: Boolean = false) : JobsResult()
}