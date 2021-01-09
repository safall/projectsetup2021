package com.safal.daggersetup

import android.app.Application
import com.safal.daggersetup.di.AppComponent
import com.safal.daggersetup.di.DaggerAppComponent

class DemoApplication : Application() {

    lateinit var component: AppComponent

    override fun onCreate() {
        super.onCreate()
        component = DaggerAppComponent.create()
    }
}

