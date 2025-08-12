package com.foodorderingapp

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class FoodOrderingApplication : Application() {
    
    override fun onCreate() {
        super.onCreate()
        // Initialize any app-wide dependencies here
    }
}
