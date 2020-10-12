package com.android.githubjobs.data.remote

import com.squareup.moshi.Moshi
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory

class RetrofitImpl : IRetrofit {

    private val retrofit: Retrofit

    init {
        val moshi = Moshi.Builder()
            .addLast(KotlinJsonAdapterFactory())
            .build()

        retrofit = Retrofit.Builder()
            .baseUrl("... caminho API build.config ...")
            .addConverterFactory(MoshiConverterFactory.create(moshi))
            .build()
    }

    override fun getInstance(): Api {
        return retrofit.create(Api::class.java)
    }
}