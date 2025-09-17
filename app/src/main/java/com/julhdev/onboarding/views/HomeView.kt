package com.julhdev.onboarding.views

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController


@Composable
        /**
         * Composable that displays the Home view of the application.
         * It centers a text indicating that this is the Home View.
         * @param paddingValues The padding values to be applied to the view.
         * @usage HomeView(paddingValues = paddingValues)
         * @return A Column containing the centered text.
         */
fun HomeView(paddingValues: PaddingValues, navController: NavController) {
  Column(
    verticalArrangement = Arrangement.Center,
    horizontalAlignment = Alignment.CenterHorizontally,
    modifier = Modifier
      .fillMaxSize()
      .padding(paddingValues)
  ) {
    Text(
      text = "Home View",
      fontSize = 30.sp,
      fontWeight = FontWeight.Bold
    )
  }
}