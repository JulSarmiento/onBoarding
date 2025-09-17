package com.julhdev.onboarding.onBoardViews

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.PagerState
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.julhdev.onboarding.data.PageData
import com.julhdev.onboarding.dataStore.StoreBoarding

@Composable
        /**
         * Composable that displays a horizontal pager for onboarding screens.
         * @param item List of PageData containing the data for each page.
         * @param pagerState State of the pager to control the current page.
         * @param modifier Optional Modifier for styling.
         * @usage OnBoardingPager(item = listOfOfPages, pagerState = pagerState)
         * @return A Box containing the pager and its content.
         */
fun OnBoardingPager(
  item: List<PageData>,
  pagerState: PagerState,
  modifier: Modifier = Modifier,
  navController: NavController,
  store: StoreBoarding
) {
  Box(
    modifier = modifier
  ){
    Column(
      horizontalAlignment = Alignment.CenterHorizontally,
      verticalArrangement = Arrangement.Center
    ) {
      HorizontalPager(
        state = pagerState,
      ) { page ->
        Column(
          modifier = Modifier
            .padding(30.dp)
            .fillMaxWidth(),
          horizontalAlignment = Alignment.CenterHorizontally
        ) {

          LoadData(
            modifier = Modifier
              .size(200.dp)
              .fillMaxWidth()
              .align(alignment = Alignment.CenterHorizontally),
            image= item[page].image,
          )

          Text(
            text = item[page].title,
            modifier = Modifier
              .padding(top = 50.dp),
            color = Color.Black,
            style = MaterialTheme.typography.displayMedium,
            fontWeight = FontWeight.Bold
          )

          Text(
            text = item[page].description,
            modifier = Modifier
              .padding(top = 15.dp),
            color = Color.Gray,
            textAlign = TextAlign.Center,
            style = MaterialTheme.typography.bodyMedium,
            fontWeight = FontWeight.Light
          )
        }
      }

      PageIndicator(
        size = item.size,
        currentPage = pagerState.currentPage
      )
    }

    Box(
      modifier = Modifier
        .align(Alignment.BottomCenter)
    ){
      BtnFinish(
        currentPage = pagerState.currentPage,
        navController,
        store = StoreBoarding(navController.context)
      )
    }

  }
}

