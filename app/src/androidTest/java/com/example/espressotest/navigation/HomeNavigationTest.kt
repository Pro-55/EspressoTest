package com.example.espressotest.navigation

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.contrib.RecyclerViewActions.actionOnItemAtPosition
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.internal.runner.junit4.AndroidJUnit4ClassRunner
import com.example.espressotest.R
import com.example.espressotest.data.DummyData
import com.example.espressotest.ui.MainActivity
import com.example.espressotest.ui.home.UsersAdapter
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4ClassRunner::class)
class HomeNavigationTest {

    @get:Rule val activityScenarioRule = ActivityScenarioRule(MainActivity::class.java)

    @Test
    fun test_checkViewVisibility() {
        checkIsDisplayedWithId(R.id.layout_constraint_home)
        checkIsDisplayedWithId(R.id.txt_title)
        checkIsDisplayedWithId(R.id.recycler_users)
    }

    @Test
    fun test_selectItem_0_isDetailsVisible() {
        val user = DummyData.getUsers()[0]
        clickOnItemWithId(R.id.recycler_users, 0)
        checkIsDisplayedWithId(R.id.layout_constraint_details)
        checkIsDisplayedWithId(R.id.img_details_profile)
        checkIsDisplayedWithId(R.id.txt_details_name)
        checkTextWithId(R.id.txt_details_name, "${user.fName} ${user.lName}")
        clickWithId(R.id.img_btn_back)
        checkIsDisplayedWithId(R.id.layout_constraint_home)
        checkIsDisplayedWithId(R.id.txt_title)
        checkIsDisplayedWithId(R.id.recycler_users)
    }

    @Test
    fun test_selectListItem_1_isDetailsVisible() {
        val user = DummyData.getUsers()[1]
        clickOnItemWithId(R.id.recycler_users, 1)
        checkIsDisplayedWithId(R.id.layout_constraint_details)
        checkIsDisplayedWithId(R.id.img_details_profile)
        checkIsDisplayedWithId(R.id.txt_details_name)
        checkTextWithId(R.id.txt_details_name, "${user.fName} ${user.lName}")
        clickWithId(R.id.img_btn_back)
        checkIsDisplayedWithId(R.id.layout_constraint_home)
        checkIsDisplayedWithId(R.id.txt_title)
        checkIsDisplayedWithId(R.id.recycler_users)
    }

    @Test
    fun test_selectListItem_2_isDetailsVisible() {
        val user = DummyData.getUsers()[2]
        clickOnItemWithId(R.id.recycler_users, 2)
        checkIsDisplayedWithId(R.id.layout_constraint_details)
        checkIsDisplayedWithId(R.id.img_details_profile)
        checkIsDisplayedWithId(R.id.txt_details_name)
        checkTextWithId(R.id.txt_details_name, "${user.fName} ${user.lName}")
        clickWithId(R.id.img_btn_back)
        checkIsDisplayedWithId(R.id.layout_constraint_home)
        checkIsDisplayedWithId(R.id.txt_title)
        checkIsDisplayedWithId(R.id.recycler_users)
    }

    @Test
    fun test_selectListItem_3_isDetailsVisible() {
        val user = DummyData.getUsers()[3]
        clickOnItemWithId(R.id.recycler_users, 3)
        checkIsDisplayedWithId(R.id.layout_constraint_details)
        checkIsDisplayedWithId(R.id.img_details_profile)
        checkIsDisplayedWithId(R.id.txt_details_name)
        checkTextWithId(R.id.txt_details_name, "${user.fName} ${user.lName}")
        clickWithId(R.id.img_btn_back)
        checkIsDisplayedWithId(R.id.layout_constraint_home)
        checkIsDisplayedWithId(R.id.txt_title)
        checkIsDisplayedWithId(R.id.recycler_users)
    }

    @Test
    fun test_selectListItem_4_isDetailsVisible() {
        val user = DummyData.getUsers()[4]
        clickOnItemWithId(R.id.recycler_users, 4)
        checkIsDisplayedWithId(R.id.layout_constraint_details)
        checkIsDisplayedWithId(R.id.img_details_profile)
        checkIsDisplayedWithId(R.id.txt_details_name)
        checkTextWithId(R.id.txt_details_name, "${user.fName} ${user.lName}")
        clickWithId(R.id.img_btn_back)
        checkIsDisplayedWithId(R.id.layout_constraint_home)
        checkIsDisplayedWithId(R.id.txt_title)
        checkIsDisplayedWithId(R.id.recycler_users)
    }

    @Test
    fun test_selectListItem_5_isDetailsVisible() {
        val user = DummyData.getUsers()[5]
        clickOnItemWithId(R.id.recycler_users, 5)
        checkIsDisplayedWithId(R.id.layout_constraint_details)
        checkIsDisplayedWithId(R.id.img_details_profile)
        checkIsDisplayedWithId(R.id.txt_details_name)
        checkTextWithId(R.id.txt_details_name, "${user.fName} ${user.lName}")
        clickWithId(R.id.img_btn_back)
        checkIsDisplayedWithId(R.id.layout_constraint_home)
        checkIsDisplayedWithId(R.id.txt_title)
        checkIsDisplayedWithId(R.id.recycler_users)
    }

    private fun checkIsDisplayedWithId(id: Int) = onView(withId(id))
        .check(matches(isDisplayed()))

    private fun checkTextWithId(id: Int, expectedText: String) = onView(withId(id))
        .check(matches(withText(expectedText)))

    private fun clickWithId(id: Int) = onView(withId(id))
        .perform(click())

    private fun clickOnItemWithId(id: Int, index: Int) =
        onView(withId(id))
            .perform(actionOnItemAtPosition<UsersAdapter.ViewHolder>(index, click()))

}