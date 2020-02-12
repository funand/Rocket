package com.example.space.networkService

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class LaunchService {

    companion object{
        val BASE_URL = "https://api.spacexdata.com/v3/"

        private val retrofit = Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build()

        val launchApi = retrofit.create(LaunchApi::class.java)
    }
}