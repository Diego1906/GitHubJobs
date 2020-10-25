package com.android.githubjobs.presentation.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.android.githubjobs.data.remote.RetrofitImpl
import com.android.githubjobs.data.repository.RepositoryImpl
import com.android.githubjobs.domain.model.Jobs
import com.android.githubjobs.domain.usecase.IUseCase
import com.android.githubjobs.domain.usecase.UseCaseImpl
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch


// class JobsViewModel(private val usecase: IUseCase, application: Application) :
//    AndroidViewModel(application) {


class JobsViewModel : ViewModel() {

    private val usecase: IUseCase = UseCaseImpl(RepositoryImpl(RetrofitImpl()))

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