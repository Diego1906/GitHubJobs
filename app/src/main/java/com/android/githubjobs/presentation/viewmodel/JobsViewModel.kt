package com.android.githubjobs.presentation.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.android.githubjobs.domain.models.Jobs
import com.android.githubjobs.domain.usecase.IUseCase
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class JobsViewModel(private val usecase: IUseCase, application: Application) :
    AndroidViewModel(application) {

    private var _listJobs = MutableLiveData<List<Jobs>>()
    val listJobs: LiveData<List<Jobs>>
        get() = _listJobs

    fun getByFilter(search: String) {
        GlobalScope.launch(Dispatchers.IO) {
            try {
                _listJobs.postValue(usecase.getByFilter(search))
            } catch (ex: Throwable) {
                //TODO: not implemented
            }
        }
    }

    fun getAll(search: String) {
        GlobalScope.launch(Dispatchers.IO) {
            try {
                _listJobs.postValue(usecase.getAll())
            } catch (ex: Throwable) {
                //TODO: not implemented
            }
        }
    }
}