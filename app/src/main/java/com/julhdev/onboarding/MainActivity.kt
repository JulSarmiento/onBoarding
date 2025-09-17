package com.julhdev.onboarding

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import com.julhdev.onboarding.navigation.NavManager
import com.julhdev.onboarding.onBoardViews.MainOnBoarding
import com.julhdev.onboarding.ui.theme.OnBoardingTheme

class MainActivity : ComponentActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    enableEdgeToEdge()
    setContent {
      OnBoardingTheme {
        Scaffold(modifier = Modifier.fillMaxSize()) { paddingValues ->
          NavManager(paddingValues)
        }
      }
    }
  }
}

