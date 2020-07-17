package com.example.espressotest.utils.extensions

import android.os.Bundle
import androidx.fragment.app.FragmentActivity
import com.example.espressotest.framework.BaseFragment


fun FragmentActivity.attachFragment(
    container: Int,
    fragment: Class<out BaseFragment>,
    args: Bundle? = null
) {
    val backStackName = fragment.simpleName

    supportFragmentManager.beginTransaction()
        .replace(container, fragment, args)
        .addToBackStack(backStackName)
        .commit()
}

fun FragmentActivity.addFragment(
    container: Int,
    fragment: Class<out BaseFragment>,
    args: Bundle? = null
) {
    val backStackName = fragment::class.java.simpleName

    supportFragmentManager.beginTransaction()
        .add(container, fragment, args)
        .addToBackStack(backStackName)
        .commit()
}