package com.android.githubjobs.presentation.viewmodel

import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.android.githubjobs.domain.model.Jobs
import com.android.githubjobs.domain.usecase.IUseCase
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class JobsViewModel @ViewModelInject constructor(private val usecase: IUseCase) : ViewModel() {

    private var _jobs = MutableLiveData<List<Jobs>>()
    val jobs: LiveData<List<Jobs>>
        get() = _jobs

    fun getByFilter(search: String) {
        GlobalScope.launch(Dispatchers.IO) {
            try {
                _jobs.postValue(usecase.getByFilter(search))
            } catch (ex: Throwable) {
                //TODO: not implemented
            }
        }
    }

    fun getAll() {
        GlobalScope.launch(Dispatchers.IO) {
            try {
                _jobs.postValue(usecase.getAll())
            } catch (ex: Throwable) {
                //TODO: not implemented
            }
        }
    }
}