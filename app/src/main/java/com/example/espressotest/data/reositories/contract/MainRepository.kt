package com.example.espressotest.data.reositories.contract

import com.example.espressotest.data.models.User

interface MainRepository {

    fun getUsers(): List<User>

    fun getUser(id: Int): User?

}