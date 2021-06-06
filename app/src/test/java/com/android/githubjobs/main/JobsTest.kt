package com.android.githubjobs.main

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import androidx.lifecycle.Observer
import com.android.githubjobs.data.dto.JobsResult
import com.android.githubjobs.data.repository.MockRepository
import com.android.githubjobs.domain.JobsUseCaseTest
import com.android.githubjobs.domain.entities.Jobs
import com.android.githubjobs.mock.JobsMock
import com.android.githubjobs.viewmodel.ViewModelMock
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.Mock
import org.mockito.junit.MockitoJUnitRunner
import org.mockito.kotlin.verify

@RunWith(MockitoJUnitRunner::class)
class JobsTest {

    private val viewModel by lazy {
        ViewModelMock(JobsUseCaseTest(MockRepository(JobsResult.Success(getJobs()))))
    }

    @get: Rule
    val rule = InstantTaskExecutorRule()

    @Mock
    private lateinit var jobsObserver: Observer<List<Jobs>>

    // Testing Success
    @Test
    fun `when viewModel getJobs get success then sets jobsLiveData`() {
        // Arrange
        viewModel.jobs.observeForever(jobsObserver)

        // Act
        viewModel.getAll()

        // Assert
        verify(jobsObserver).onChanged(getJobs())
    }

    companion object {
        private lateinit var JOBS: List<Jobs>

        fun getJobs(): List<Jobs> {
            if (!::JOBS.isInitialized) {
                JOBS = JobsMock.create()
            }
            return JOBS
        }
    }
}