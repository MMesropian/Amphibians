package com.example.amphibians.ui.screens

import androidx.lifecycle.ViewModel
import com.example.amphibians.model.Amphibian

class AmphibiansViewModel: ViewModel() {


}

sealed interface AmphibiansUiState{
    data class Success(val amphibians: List<Amphibian>): AmphibiansUiState
    object Error: AmphibiansUiState
    object Loading: AmphibiansUiState
}