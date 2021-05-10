package com.android.githubjobs.data.di

import com.android.githubjobs.data.remote.IRetrofit
import com.android.githubjobs.data.remote.RetrofitImpl
import com.android.githubjobs.domain.repository.IRepository
import com.android.githubjobs.data.repository.RepositoryImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent

@InstallIn(ActivityComponent::class)
@Module
object DataModule {
    @Provides
    fun provideRetrofit(): IRetrofit = RetrofitImpl()

    @Provides
    fun provideRepository(api: IRetrofit): IRepository = RepositoryImpl(api)
}