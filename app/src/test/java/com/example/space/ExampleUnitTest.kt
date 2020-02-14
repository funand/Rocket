package com.example.space

import com.example.space.Models.Launch
import com.example.space.util.LaunchLists
import com.example.space.viewModel.LaunchViewModel
import org.junit.Assert
import org.junit.Assert.assertEquals
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4
import org.mockito.Mock
import org.mockito.MockitoAnnotations

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see [Testing documentation](http://d.android.com/tools/testing)
 */
@RunWith(JUnit4::class)
class ExampleUnitTest {

    @Mock
    lateinit var launchViewModel: LaunchViewModel
    @Before
    @Throws(Exception::class)
    fun setUp() {
        MockitoAnnotations.initMocks(this)
        launchViewModel = LaunchViewModel()
    }

    @Before
    @Test
    fun addition_isCorrect() {
        Assert.assertEquals(4, 2 + 2.toLong())
    }

    @Test
    fun sampleLaunchList_sortsLaunchesbyYear_indexAtOneEqualsThree() {
        var subject = LaunchLists().getLaunchList()
        subject = launchViewModel.getSortedLaunchList(subject)

        assertEquals(subject.get(1).launchYear.toInt(), 2019)
    }
}