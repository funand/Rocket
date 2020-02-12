package com.example.space

import com.example.space.Models.Launch
import com.example.space.util.LaunchLists
import org.junit.Assert
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4
import org.mockito.MockitoAnnotations

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see [Testing documentation](http://d.android.com/tools/testing)
 */
@RunWith(JUnit4::JUnit4::)
class ExampleUnitTest {
    @Before
    @Throws(Exception::class)
    fun setUp() {
        MockitoAnnotations.initMocks(this)
    }

    @Before
    @Test
    fun addition_isCorrect() {
        Assert.assertEquals(4, 2 + 2.toLong())
    }

    @Test
    fun sampleLaunchList_sortsLaunchesbyYear_indexAtZero() {
        val subject: Launch = LaunchLists::class.java.
    }
}