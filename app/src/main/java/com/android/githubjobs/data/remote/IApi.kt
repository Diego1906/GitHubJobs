package com.android.githubjobs.data.remote

import com.android.githubjobs.data.models.JobsResponse
import retrofit2.http.GET
import retrofit2.http.Query

interface IApi {

    @GET("positions.json")
    suspend fun getAll(@Query("search") search: String = ""): List<JobsResponse>
}