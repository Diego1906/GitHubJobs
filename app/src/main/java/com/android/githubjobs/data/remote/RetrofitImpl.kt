package com.android.githubjobs.data.remote

import com.android.githubjobs.BuildConfig
import com.squareup.moshi.Moshi
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import javax.inject.Inject

class RetrofitImpl @Inject constructor() : IRetrofit {

    private val retrofit: Retrofit

    init {
        val moshi = Moshi.Builder()
            .addLast(KotlinJsonAdapterFactory())
            .build()

        retrofit = Retrofit.Builder()
            .baseUrl(BuildConfig.URL_BASE)
            .addConverterFactory(MoshiConverterFactory.create(moshi))
            //   .addCallAdapterFactory(CoroutineCallAdapterFactory())
            .build()
    }

    override fun getInstance(): IApi {
        return retrofit.create(IApi::class.java)
    }
}