package com.android.githubjobs.presentation.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import com.android.githubjobs.R
import com.android.githubjobs.presentation.adapter.JobsAdapter
import com.android.githubjobs.presentation.viewmodel.JobsViewModel
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.android.synthetic.main.fragment_start.*

@AndroidEntryPoint
class StartFragment : Fragment() {

    private val viewModel by viewModels<JobsViewModel>()

    private lateinit var adapter: JobsAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_start, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        initAdapter()
        initRecyclerAdapter()
        initObserver()
    }

    override fun onStart() {
        super.onStart()
        viewModel.getAll()
    }

    private fun initAdapter() {
        adapter = JobsAdapter {
            println("This is Job: $it")

            // Todo: Navegar para a tela de detalhes
        }
    }

    private fun initRecyclerAdapter() {
        recyclerItemJobs?.adapter = adapter
    }

    private fun initObserver() {
        viewModel.jobs.observe(viewLifecycleOwner, Observer { jobs ->
            jobs?.let {
                adapter.submitList(it)
            }
        })
    }
}