package com.julhdev.onboarding.views

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.navigation.NavController
import com.julhdev.onboarding.R
import kotlinx.coroutines.delay

@Composable
fun SplashScreen(navController: NavController, store: Boolean ) {

  var screen by remember { mutableStateOf("") }
  screen = if(store) "Home" else "OnBoarding"

  LaunchedEffect(
    Unit
  ) {
    delay(2000)
    navController.navigate(screen){
      popUpTo("Splash"){ inclusive = true}
    }
  }

  Box(
    contentAlignment = Alignment.Center,
    modifier = Modifier
      .fillMaxSize()
  ){
    Image(
      painter = painterResource(R.drawable.splash),
      contentDescription = "Splash Screen"
    )
  }
}