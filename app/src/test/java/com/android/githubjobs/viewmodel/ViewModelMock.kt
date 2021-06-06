package com.android.githubjobs.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.android.githubjobs.domain.JobsUseCaseTest
import com.android.githubjobs.domain.entities.Jobs
import kotlinx.coroutines.cancel

class ViewModelMock constructor(private val useCase: JobsUseCaseTest) : ViewModel() {

    private var _jobs = MutableLiveData<List<Jobs>>()
    val jobs: LiveData<List<Jobs>>
        get() = _jobs

    fun getAll() {
        _jobs.value = useCase.getAll()
    }

    override fun onCleared() {
        super.onCleared()
        viewModelScope.cancel()
    }
}
