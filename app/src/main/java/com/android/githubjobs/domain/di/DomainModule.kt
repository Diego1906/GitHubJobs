package com.android.githubjobs.domain.di

import com.android.githubjobs.domain.repository.IRepository
import com.android.githubjobs.domain.usecase.IUseCase
import com.android.githubjobs.domain.usecase.UseCaseImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent

@InstallIn(ActivityComponent::class)
@Module
class DomainModule {
    @Provides
    fun provideUseCase(repository: IRepository): IUseCase = UseCaseImpl(repository)
}