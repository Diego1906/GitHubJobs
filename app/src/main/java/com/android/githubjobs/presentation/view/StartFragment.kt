package com.android.githubjobs.presentation.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import androidx.navigation.fragment.findNavController
import com.android.githubjobs.R
import com.android.githubjobs.presentation.adapter.JobsAdapter
import com.android.githubjobs.presentation.viewmodel.JobsViewModel
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.android.synthetic.main.fragment_start.*

@AndroidEntryPoint
class StartFragment : Fragment() {

    private val viewModel by viewModels<JobsViewModel>()

    private val adapter = JobsAdapter { jobs ->
        findNavController().navigate(
            StartFragmentDirections.actionStartFragmentToDetailFragment(jobs)
        )
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_start, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        initRecyclerAdapter()
        initObserver()
    }

    override fun onStart() {
        super.onStart()
        viewModel.getAll()
    }

    private fun initRecyclerAdapter() {
        recyclerItemJobs?.adapter = adapter
    }

    private fun initObserver() {
        viewModel.jobs.observe(viewLifecycleOwner, Observer { jobs ->
            jobs?.let {
                viewModel.hideProgress()
                adapter.submitList(jobs)
            }
        })

        viewModel.progress.observe(viewLifecycleOwner, Observer { value ->
            value?.let {
                progress_circular?.visibility = value
            }
        })
    }
}