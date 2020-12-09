package com.sachin.runningtracking.ui.viewmodels

import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.ViewModel
import com.sachin.runningtracking.repositories.MainRepository

class MainViewModel @ViewModelInject constructor(
        val mainRepository: MainRepository
) : ViewModel() {

}