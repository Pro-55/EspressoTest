package com.example.espressotest.di.main

import androidx.lifecycle.ViewModel
import com.example.espressotest.MainViewModel
import com.example.espressotest.di.ViewModelKey
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
abstract class MainViewModelModule {

    @Binds
    @IntoMap
    @ViewModelKey(MainViewModel::class)
    abstract fun bindMainViewModel(viewModel: MainViewModel): ViewModel

}