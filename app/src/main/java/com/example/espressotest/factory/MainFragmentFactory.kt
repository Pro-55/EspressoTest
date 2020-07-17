package com.example.espressotest.factory

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentFactory
import com.example.espressotest.ui.details.DetailsFragment
import com.example.espressotest.ui.home.HomeFragment

class MainFragmentFactory : FragmentFactory() {

    companion object {
        private val TAG = MainFragmentFactory::class.java
    }

    override fun instantiate(classLoader: ClassLoader, className: String): Fragment =
        when (className) {
            HomeFragment::class.java.name -> HomeFragment.newInstance()
            DetailsFragment::class.java.name -> DetailsFragment.newInstance()
            else -> super.instantiate(classLoader, className)
        }


}