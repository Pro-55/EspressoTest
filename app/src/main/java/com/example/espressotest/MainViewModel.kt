package com.example.espressotest

import android.util.Log
import androidx.lifecycle.ViewModel
import com.example.espressotest.BuildConfig.isTest
import com.example.espressotest.data.models.User
import com.example.espressotest.data.reositories.contract.MainRepository
import com.example.espressotest.data.reositories.impl.MainRepoImpl
import com.example.espressotest.data.reositories.testimpl.MainRepoTestImpl
import javax.inject.Inject

class MainViewModel @Inject constructor(
    private val repoImpl: MainRepoImpl,
    private val repoTestImpl: MainRepoTestImpl
) : ViewModel() {

    companion object {
        private val TAG = MainViewModel::class.java.simpleName
    }

    private val repo: MainRepository = setRepo()

    private fun setRepo(): MainRepository {
        return if (isTest) repoTestImpl else repoImpl
    }

    fun getUsers(): List<User> = repo.getUsers()

    fun getUser(id: Int): User? = repo.getUser(id)

}