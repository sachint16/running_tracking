package com.sachin.runningtracking.ui.fragments

import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.sachin.runningtracking.R
import com.sachin.runningtracking.ui.viewmodels.MainViewModel
import com.sachin.runningtracking.ui.viewmodels.StatisticsViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class StatisticsFragment : Fragment(R.layout.fragment_statistics) {
    val viewModel: StatisticsViewModel by viewModels()
}