package com.example.espressotest.di

import android.app.Application
import android.content.Context
import android.content.SharedPreferences
import com.example.espressotest.utils.Constants
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
object AppModule {

    @Singleton
    @Provides
    fun provideSharedPreferences(application: Application): SharedPreferences =
        application.getSharedPreferences(Constants.ESPRESSO_SHARED_PREFS, Context.MODE_PRIVATE)

}