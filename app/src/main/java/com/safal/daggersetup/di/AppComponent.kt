package com.safal.daggersetup.di

import com.safal.daggersetup.di.viewmodel.ViewModelModule
import com.safal.daggersetup.ui.main.MainFragment
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [AppModule::class, ViewModelModule::class])
interface AppComponent {
    fun inject(mainFragment: MainFragment)
}
