package com.android.githubjobs.presentation.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.android.githubjobs.databinding.DetailFragmentBinding

class DetailFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        val jobs = DetailFragmentArgs.fromBundle(requireArguments()).jobs

        val binding = DetailFragmentBinding.inflate(inflater).apply {
            lifecycleOwner = viewLifecycleOwner
            this.jobs = jobs
        }

        return binding.root
    }
}