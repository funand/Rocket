package com.example.space.DependencyInjection

import android.app.Application
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class LaunchApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@LaunchApplication)
            modules(LaunchModule)
        }
    }
}