package com.safal.daggersetup.di.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.safal.daggersetup.ui.main.MainViewModel
import com.safal.daggersetup.di.viewmodel.ViewModelFactory
import com.safal.daggersetup.di.viewmodel.ViewModelKey
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
abstract class ViewModelModule {
    @Binds
    internal abstract fun bindViewModelFactory(factory: ViewModelFactory): ViewModelProvider.Factory

    @Binds
    @IntoMap
    @ViewModelKey(MainViewModel::class)
    abstract fun MainViewModel.provideViewModel(): ViewModel
}