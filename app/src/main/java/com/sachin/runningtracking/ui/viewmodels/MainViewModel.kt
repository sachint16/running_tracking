package com.sachin.runningtracking.ui.viewmodels

import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.sachin.runningtracking.db.Run
import com.sachin.runningtracking.repositories.MainRepository
import kotlinx.coroutines.launch

class MainViewModel @ViewModelInject constructor(
        val mainRepository: MainRepository
) : ViewModel() {

    fun insertRun(run:Run) = viewModelScope.launch {
        mainRepository.insertRun(run)
    }
}