package com.android.githubjobs.data.di

import com.android.githubjobs.data.remote.IService
import com.android.githubjobs.data.remote.ServiceImpl
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
    fun provideService(): IService = ServiceImpl()

    @Provides
    fun provideRepository(api: IService): IRepository = RepositoryImpl(api)
}