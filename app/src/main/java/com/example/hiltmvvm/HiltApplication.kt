package com.example.hiltmvvm

import android.app.Application
import androidx.work.Configuration
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class HiltApplication: Application(), Configuration.Provider {
    override val workManagerConfiguration: Configuration = Configuration.Builder()
        .setMinimumLoggingLevel(android.util.Log.DEBUG)
        .build()
}