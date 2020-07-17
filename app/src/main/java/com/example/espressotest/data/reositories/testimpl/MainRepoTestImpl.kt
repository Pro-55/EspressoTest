package com.example.espressotest.data.reositories.testimpl

import android.util.Log
import com.example.espressotest.data.DummyData
import com.example.espressotest.data.models.User
import com.example.espressotest.data.reositories.contract.MainRepository

class MainRepoTestImpl : MainRepository {

    companion object {
        private val TAG = MainRepoTestImpl::class.java.simpleName
    }

    override fun getUsers(): List<User> {
        Log.d(TAG, "TestLog: getUsers")
        return DummyData.getUsers()
    }

    override fun getUser(id: Int): User? {
        Log.d(TAG, "TestLog: getUser")
        return DummyData.getUser(id)
    }

}