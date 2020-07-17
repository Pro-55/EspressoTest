package com.example.espressotest.di.main

import com.example.espressotest.data.reositories.impl.MainRepoImpl
import com.example.espressotest.data.reositories.testimpl.MainRepoTestImpl
import dagger.Module
import dagger.Provides

@Module
object MainRepositoryModule {

    @MainScope
    @Provides
    fun provideMainRepoImpl() = MainRepoImpl()

    @MainScope
    @Provides
    fun provideMainRepoTestImpl() = MainRepoTestImpl()

}