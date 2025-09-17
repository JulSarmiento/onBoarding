package com.julhdev.onboarding.onBoardViews

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.PagerState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavController
import com.julhdev.onboarding.R
import com.julhdev.onboarding.data.PageData
import com.julhdev.onboarding.dataStore.StoreBoarding

@Composable
fun MainOnBoarding(paddingValues: PaddingValues, navController: NavController, store: StoreBoarding) {
  val items = listOf(
    PageData(
      image = R.raw.welcome,
      title = "Welcome",
      description = "Lorem ipsum dolor sit amet, consectetur adipiscing elit."
    ),
    PageData(
      image = R.raw.progress,
      title = "Mobile",
      description = "Lorem ipsum dolor sit amet, consectetur adipiscing elit."
    ),
    PageData(
      image = R.raw.success,
      title = "Love",
      description = "Lorem ipsum dolor sit amet, consectetur adipiscing elit."
    )
  )

  val pagerState = rememberPagerState(pageCount = { items.size }, initialPage = 0)

  HorizontalPager(
    state = pagerState,
    modifier = Modifier
      .padding(paddingValues)
      .fillMaxSize()
      .background(Color.White)
  ) { page ->
    OnBoardingPager(item = items, pagerState = pagerState, navController = navController, store = store)
  }
}
