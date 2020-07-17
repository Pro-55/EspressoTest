package com.example.espressotest.ui

import android.os.Bundle
import com.example.espressotest.R
import com.example.espressotest.factory.MainFragmentFactory
import com.example.espressotest.ui.home.HomeFragment
import com.example.espressotest.utils.extensions.attachFragment
import dagger.android.support.DaggerAppCompatActivity

class MainActivity : DaggerAppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        supportFragmentManager.fragmentFactory = MainFragmentFactory()
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        attachFragment(R.id.view_fragment_container, HomeFragment::class.java)

    }

    override fun onBackPressed() {
        if (supportFragmentManager.backStackEntryCount > 1)
            super.onBackPressed()
        else
            finish()
    }
}