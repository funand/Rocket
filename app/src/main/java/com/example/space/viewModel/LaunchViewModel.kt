package com.example.space.viewModel;

import android.app.Application;
import android.util.Log

import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel

import com.example.space.Models.Launch;
import com.example.space.repository.Repository;

class LaunchViewModel() : ViewModel() {
    private var repository = Repository()


    fun getLaunches() : LiveData<List<Launch>>{
        repository.getLaunches()
        return repository.getLaunchList()
    }

    fun getSortedLaunchList(dataset : List<Launch>) : List<Launch>{
        var map = mutableMapOf<Int, Launch>()
        for(launch in dataset){
            var launchYear = launch.launchYear.toInt()
            map[launchYear] = launch
        }
        return map.toSortedMap().values.reversed()
    }

}
