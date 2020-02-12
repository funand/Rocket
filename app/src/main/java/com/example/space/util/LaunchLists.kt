package com.example.space.util

import com.example.space.Models.Launch

class LaunchLists {

    fun getLaunchList() : List<Launch> {
        var launch1 =  Launch()
        var launch2 =  Launch()
        var launch3 =  Launch()
        var launch4 =  Launch()

        launch1.launchYear ="1"
        launch2.launchYear ="2"
        launch3.launchYear ="3"
        launch4.launchYear ="4"

        return listOf(launch1, launch2, launch3, launch4)
    }
}