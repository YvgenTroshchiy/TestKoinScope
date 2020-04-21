package com.troshchiy.testkoinscope

import android.app.Application
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.KoinApplication
import org.koin.core.context.startKoin

const val TAG = "testkoinscope"

class App : Application() {

    companion object {
        lateinit var koin: KoinApplication
    }

    override fun onCreate() {
        super.onCreate()

        koin = startKoin {
            androidContext(this@App)
            androidLogger()
            modules(allAppModules)
        }
    }
}