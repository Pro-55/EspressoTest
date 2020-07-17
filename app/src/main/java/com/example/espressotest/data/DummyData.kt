package com.example.espressotest.data

import com.example.espressotest.R
import com.example.espressotest.data.models.User

object DummyData {

    private val CB = User(
        1,
        "Chandler",
        "Bing",
        R.drawable.avatar_chandler
    )

    private val MG = User(
        2,
        "Monica",
        "Geller",
        R.drawable.avatar_monica
    )

    private val JT = User(
        3,
        "Joey",
        "Tribbiani",
        R.drawable.avatar_joey
    )

    private val RG = User(
        4,
        "Rachel",
        "Green",
        R.drawable.avatar_rachel
    )

    private val RsG = User(
        5,
        "Ross",
        "Geller",
        R.drawable.avatar_ross
    )

    private val PB = User(
        6,
        "Phoebe",
        "Buffay",
        R.drawable.avatar_phoebe
    )

    private val users = listOf(CB, MG, JT, RG, RsG, PB)

    fun getUser(id: Int): User? = users.find { u -> u._id == id }

    fun getUsers(): List<User> = users

}