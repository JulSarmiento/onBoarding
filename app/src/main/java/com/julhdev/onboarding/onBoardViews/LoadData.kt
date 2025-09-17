package com.julhdev.onboarding.onBoardViews

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import com.airbnb.lottie.compose.LottieAnimation
import com.airbnb.lottie.compose.LottieCompositionSpec
import com.airbnb.lottie.compose.LottieConstants
import com.airbnb.lottie.compose.rememberLottieComposition


/**
 * Composable that loads and displays a Lottie animation.
 * @param modifier Modifier for styling the animation.
 * @param image Resource ID of the Lottie animation file.
 * @usage LoadData(modifier = Modifier.size(200.dp), image = R.raw.animation)
 * @return A Lottie animation displayed with the specified modifier.
 */
@Composable
fun LoadData(
  modifier: Modifier,
  image: Int,
) {

  val composition by rememberLottieComposition(LottieCompositionSpec.RawRes(image))

  LottieAnimation(
    composition = composition,
    iterations = LottieConstants.IterateForever,
    modifier = modifier
  )

}
