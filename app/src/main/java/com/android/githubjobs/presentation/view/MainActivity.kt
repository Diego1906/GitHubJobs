package com.android.githubjobs.presentation.view

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.android.githubjobs.R
import com.android.githubjobs.presentation.viewmodel.JobsViewModel
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val viewModel by lazy {
        ViewModelProvider.NewInstanceFactory().create(JobsViewModel::class.java)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initViewModel()
        setListeners()
    }

    private fun initViewModel() {
        viewModel.jobs.observe(this, Observer { jobs ->
            jobs?.let {
                it.forEach {
                    println("Teste Jobs: $it")
                }
            }
        })
    }

    private fun setListeners() {
        textClick.setOnClickListener {
            viewModel.getAll()
        }
    }
}