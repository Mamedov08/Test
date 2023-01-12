package com.example.test

import android.view.View
import android.view.ViewManager
import androidx.test.core.app.ActivityScenario
import androidx.test.espresso.Espresso
import androidx.test.espresso.ViewAction
import androidx.test.espresso.ViewAssertion
import androidx.test.espresso.action.ViewActions
import androidx.test.espresso.assertion.ViewAssertions
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.ext.junit.rules.ActivityScenarioRule
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking
import org.junit.Rule
import org.junit.Test

class AndroidTest {

    @Rule
    @JvmField
    var rule: ActivityScenarioRule<*> = ActivityScenarioRule(MainActivity::class.java)

    @Test
    fun simpleAdd() {
        runBlocking {
            Espresso.onView(withId(R.id.firstEd)).perform(ViewActions.typeText("4"))
            Espresso.onView(withId(R.id.firstEd)).perform(ViewActions.closeSoftKeyboard())
            Espresso.onView(withId(R.id.secondEd)).perform(ViewActions.typeText("4"))
            Espresso.onView(withId(R.id.secondEd)).perform(ViewActions.closeSoftKeyboard())
            Espresso.onView(withId(R.id.calculatePlus)).perform(ViewActions.click())
            Espresso.onView(withId(R.id.resultEd))
                .check(ViewAssertions.matches(ViewMatchers.withText("9")))
        }

        @Test
        fun divide() {
            runBlocking {
                Espresso.onView(withId(R.id.firstEd)).perform(ViewActions.typeText("4"))
                Espresso.onView(withId(R.id.firstEd)).perform(ViewActions.closeSoftKeyboard())
                Espresso.onView(withId(R.id.secondEd)).perform(ViewActions.typeText("4"))
                Espresso.onView(withId(R.id.secondEd)).perform(ViewActions.closeSoftKeyboard())
                Espresso.onView(withId(R.id.calculateDivide)).perform(ViewActions.click())
                Espresso.onView(withId(R.id.resultEd))
                    .check(ViewAssertions.matches(ViewMatchers.withText("9")))
            }
        }
    }
}