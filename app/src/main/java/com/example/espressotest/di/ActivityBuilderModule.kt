package com.example.espressotest.di

import com.example.espressotest.di.main.FragmentBuilderModule
import com.example.espressotest.di.main.MainRepositoryModule
import com.example.espressotest.di.main.MainScope
import com.example.espressotest.di.main.MainViewModelModule
import com.example.espressotest.ui.MainActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivityBuilderModule {

    @MainScope
    @ContributesAndroidInjector(
        modules = [
            MainViewModelModule::class,
            FragmentBuilderModule::class,
            MainRepositoryModule::class
        ]
    )
    abstract fun contributeMainActivity(): MainActivity

}