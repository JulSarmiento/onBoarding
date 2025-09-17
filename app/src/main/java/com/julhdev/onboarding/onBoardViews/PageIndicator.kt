package com.julhdev.onboarding.onBoardViews

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
        /**
         * Composable that displays a page indicator for onboarding screens.
         * It shows a series of dots representing the total number of pages,
         * with the current page highlighted.
         * @param size The total number of pages.
         * @param currentPage The index of the current page.
         * @usage PageIndicator(size = totalPages, currentPage = pagerState.currentPage)
         * @return A Row containing the page indicators.
         */
fun PageIndicator(size: Int, currentPage: Int) {
  Row(
    horizontalArrangement = Arrangement.SpaceBetween,
    modifier = Modifier
      .padding(top = 60.dp)
  ) {
    repeat(size) {
      Indicator(isSelect = it == currentPage )
    }
  }
}

@Composable
        /**
         * Composable that displays a single page indicator dot.
         * The dot is styled based on whether it is selected or not.
         * @param isSelect Boolean indicating if the dot is for the current page.
         * @usage Indicator(isSelect = true)
         * @return A Box representing the page indicator dot.
         */
fun Indicator( isSelect: Boolean) {
  Box(
    modifier = Modifier
      .padding(5.dp)
      .height(10.dp)
      .width(25.dp)
      .clip(CircleShape)
      .background(if(isSelect) Color.Red else Color.Gray)
  )
}