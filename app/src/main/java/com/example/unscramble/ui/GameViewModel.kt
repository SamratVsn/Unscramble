package com.example.unscramble.ui

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow

private val _uiState = MutableStateFlow(GameUiState())
class GameViewModel: ViewModel() {

}