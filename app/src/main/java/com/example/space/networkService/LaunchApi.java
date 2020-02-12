package com.example.space.networkService;

import com.example.space.Models.Launch;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface LaunchApi {

    @GET("launches")
    Call<List<Launch>> listAllLaunches();
}
