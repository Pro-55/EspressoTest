package com.example.espressotest.framework

import dagger.android.support.DaggerFragment

open class BaseFragment : DaggerFragment() {

    companion object {
        private val TAG = BaseFragment::class.java.simpleName
    }

    open fun onBackPressed() {
        requireActivity().onBackPressed()
    }

}