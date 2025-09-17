package com.julhdev.onboarding.data

/**
 * Data class to represent a page in the onboarding process.
 * @param image Resource ID for the image to be displayed on the page.
 * @param title Title text for the page.
 * @param description Description text for the page.
 * @usage PageData(image = R.raw.image, title = "Title", description = "Description")
 */
data class PageData(
  val image: Int,
  val title: String,
  val description: String
)