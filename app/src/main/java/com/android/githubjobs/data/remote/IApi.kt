package com.android.githubjobs.data.remote

import androidx.lifecycle.LiveData
import com.android.githubjobs.data.remote.dto.JobsResponse
import retrofit2.http.GET
import retrofit2.http.Query

interface IApi {

    @GET("positions.json")
    suspend fun getByFilter(@Query("search") search: String): JobsResponse

    @GET("positions.json")
    suspend fun getAll(@Query("search") search: String = ""): LiveData<List<JobsResponse>>
}