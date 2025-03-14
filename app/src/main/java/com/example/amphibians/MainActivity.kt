package com.example.amphibians

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.amphibians.ui.screens.AmphibiansViewModel
import com.example.amphibians.ui.screens.HomeScreen
import com.example.amphibians.ui.theme.AmphibiansTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            AmphibiansTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    val amphibiansViewModel : AmphibiansViewModel = viewModel(factory = AmphibiansViewModel.Factory)
                    HomeScreen(
                        amphibiansUiState = amphibiansViewModel.amphibiansUiState,
                        retryAction = amphibiansViewModel::getAmphibians,
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}