package com.safal.daggersetup

import com.safal.daggersetup.ui.main.MainFragment
import com.safal.daggersetup.viewmodel.ViewModelModule
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [AppModule::class, ViewModelModule::class])
interface AppComponent {
    fun inject(mainFragment: MainFragment)
}
