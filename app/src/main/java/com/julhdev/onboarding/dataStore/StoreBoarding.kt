package com.julhdev.onboarding.dataStore

import android.content.Context
import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.Preferences
import androidx.datastore.preferences.core.booleanPreferencesKey
import androidx.datastore.preferences.core.edit
import androidx.datastore.preferences.preferencesDataStore
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map


/**
 * * StoreBoarding is a class that manages the storage of onboarding completion status using DataStore.
 * * It provides methods to save and retrieve the onboarding status.
 * * @param context The application context used to access DataStore.
 * * @usage val storeBoarding = StoreBoarding(context)
 * * @return An instance of StoreBoarding for managing onboarding status.
 */
class StoreBoarding(
  private val context: Context
) {

  companion object {
    private val Context.dataStore : DataStore<Preferences> by preferencesDataStore("storeBoarding")
    val STORE_BOARD = booleanPreferencesKey("store_board")
  }

  val getBoarding: Flow<Boolean> = context.dataStore.data
    .map {
      preferences -> preferences[STORE_BOARD] ?: false
    }

  suspend fun saveBoarding(completed: Boolean) {
    context.dataStore.edit {
      preferences -> preferences[STORE_BOARD] = completed
    }
  }
}