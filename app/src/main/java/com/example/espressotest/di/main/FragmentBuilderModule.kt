package com.example.espressotest.di.main

import com.example.espressotest.ui.details.DetailsFragment
import com.example.espressotest.ui.home.HomeFragment
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class FragmentBuilderModule {

    @ContributesAndroidInjector
    abstract fun contributeHomeFragment(): HomeFragment

    @ContributesAndroidInjector
    abstract fun contributeDetailsFragment(): DetailsFragment

}