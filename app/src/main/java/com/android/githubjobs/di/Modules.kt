package com.android.githubjobs.di

import com.android.githubjobs.data.remote.IRetrofit
import com.android.githubjobs.data.remote.RetrofitImpl
import com.android.githubjobs.data.repository.IRepository
import com.android.githubjobs.data.repository.RepositoryImpl
import com.android.githubjobs.domain.usecase.IUseCase
import com.android.githubjobs.domain.usecase.UseCaseImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent

@InstallIn(ActivityComponent::class)
@Module
object RetrofitModule {
    @Provides
    fun provideRetrofit(): IRetrofit = RetrofitImpl()
}

@InstallIn(ActivityComponent::class)
@Module
object RepositoryModule {
    @Provides
    fun provideRepository(api: IRetrofit): IRepository = RepositoryImpl(api)
}

@InstallIn(ActivityComponent::class)
@Module
class UseCaseModule {
    @Provides
    fun provideUseCase(repository: IRepository): IUseCase = UseCaseImpl(repository)
}