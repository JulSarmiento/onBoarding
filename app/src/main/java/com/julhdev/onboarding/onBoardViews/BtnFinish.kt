package com.julhdev.onboarding.onBoardViews

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.julhdev.onboarding.dataStore.StoreBoarding
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch


@Composable
        /**
         * Composable that displays a finish button for the onboarding process.
         * The button is centered when on the last page (currentPage == 2) and
         * spaced between when on other pages.
         * @param currentPage The current page index of the onboarding process.
         * @usage BtnFinish(currentPage = pagerState.currentPage)
         * @return A Row containing the finish button.
         */
fun BtnFinish(currentPage: Int, navController: NavController, store: StoreBoarding) {
  Row(
    modifier = Modifier
      .padding(bottom = 20.dp)
      .fillMaxWidth(),
    horizontalArrangement = if(currentPage != 2) Arrangement.SpaceBetween else Arrangement.Center
  ) {
    if( currentPage == 2) {
      OutlinedButton(
        onClick = {
          CoroutineScope(Dispatchers.IO).launch {
            store.saveBoarding(true)
          }
          navController.navigate("Home"){
            popUpTo(0)
          }
        }
      ) {
        Text(
          text = "Entrar",
          modifier = Modifier
            .padding(vertical = 8.dp, horizontal = 40.dp),
          color = Color.Gray
        )
      }
    }
  }
}