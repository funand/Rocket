package com.example.space.viewModel;

import android.app.Application;
import android.util.Log

import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import com.example.space.Models.Launch;
import com.example.space.repository.Repository;

class LaunchViewModel(application: Application) : AndroidViewModel(application) {
    var repository = Repository()


    fun getLaunches() : LiveData<List<Launch>>{
        repository.getLaunches()
        return repository.getLaunchList()
    }

}
