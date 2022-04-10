package com.kimym.startup.presentation

import androidx.lifecycle.ViewModel
import com.kimym.startup.repository.MainRepository
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow

class MainViewModel(repository: MainRepository) : ViewModel() {
    private val _message = MutableStateFlow(repository.getStartUpMessage())
    val message = _message.asStateFlow()
}
