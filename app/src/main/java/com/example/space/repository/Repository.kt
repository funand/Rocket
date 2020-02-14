package com.example.space.repository;

import android.util.Log
import androidx.lifecycle.MutableLiveData
import com.example.space.Models.Launch
import com.example.space.networkService.LaunchService
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class Repository {

    var mLaunches = MutableLiveData<List<Launch>>()

    fun getLaunches() {
        val launchesCall = LaunchService.launchApi.listAllLaunches()
        launchesCall.enqueue(object : Callback<List<Launch>> {
            override fun onFailure(call: Call<List<Launch>>, t: Throwable) {
                Log.d("error", t.message)
            }

            override fun onResponse(call: Call<List<Launch>>, response: Response<List<Launch>>) {
                response.body()?.let { launches ->
                    mLaunches.value = launches
                }
            }

        })
    }

    fun getLaunchList() = mLaunches

}
