package com.android.githubjobs.presentation.view

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import com.android.githubjobs.R
import com.android.githubjobs.presentation.viewmodel.JobsViewModel
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.android.synthetic.main.activity_main.*

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    private val viewModel: JobsViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initViewModel()
        setListeners()
    }

    private fun initViewModel() {
        viewModel.jobs.observe(this, { jobs ->
            jobs?.let { list ->
                list.forEach {
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