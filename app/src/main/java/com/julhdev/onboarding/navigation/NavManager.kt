package com.julhdev.onboarding.navigation

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.platform.LocalContext
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import androidx.navigation.compose.composable
import com.julhdev.onboarding.dataStore.StoreBoarding
import com.julhdev.onboarding.onBoardViews.MainOnBoarding
import com.julhdev.onboarding.views.HomeView
import com.julhdev.onboarding.views.SplashScreen

@Composable
        /**
         * NavManager sets up the navigation graph for the application.
         * It defines the navigation routes and their corresponding composable screens.
         * @param paddingValues The padding values to be applied to the screens.
         * @usage NavManager(paddingValues = paddingValues)
         * @return A NavHost containing the navigation graph.
         */
fun NavManager(paddingValues: PaddingValues) {
  val context = LocalContext.current
  val dataStore = StoreBoarding(context)
  val store = dataStore.getBoarding.collectAsState(initial = false)

  val navController = rememberNavController()

  NavHost(
    navController,
    startDestination = "Splash",
  ) {
    composable("OnBoarding") {
      MainOnBoarding(paddingValues, navController, dataStore)
    }
    composable("Home") {
      HomeView(paddingValues, navController)
    }
    composable("Splash") {
      SplashScreen(navController, store.value)
    }
  }
}