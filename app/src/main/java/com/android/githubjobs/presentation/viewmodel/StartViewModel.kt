package com.android.githubjobs.presentation.viewmodel

import android.view.View
import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.android.githubjobs.domain.entities.Jobs
import com.android.githubjobs.domain.usecase.IUseCase
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.cancel
import kotlinx.coroutines.launch

class StartViewModel @ViewModelInject constructor(private val useCase: IUseCase) : ViewModel() {

    private var _jobs = MutableLiveData<List<Jobs>>()
    val jobs: LiveData<List<Jobs>>
        get() = _jobs

    private var _progress = MutableLiveData<Int>()
    val progress
        get() = _progress

    fun getAll() {
        viewModelScope.launch(Dispatchers.IO) {
            try {
                _jobs.postValue(useCase.getAll())
            } catch (ex: Throwable) {
                //TODO: not implemented
            }
        }
    }

    fun hideProgress() {
        setProgress(View.INVISIBLE)
    }

    fun showProgress() {
        setProgress(View.VISIBLE)
    }

    private fun setProgress(value: Int) {
        _progress.value = value
    }

    override fun onCleared() {
        super.onCleared()
        viewModelScope.cancel()
    }
}