package com.example.space.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.space.Models.Launch;
import com.example.space.R;

public class LaunchDetail extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_launch_detail);

        getExtras();
    }

    private void getExtras(){
        if(getIntent().hasExtra("launch_selected")){

            Launch launchParcel = getIntent().getParcelableExtra("launch_selected");
            Launch launch = launchParcel;
            launch.setFlightNumber(launchParcel.getFlightNumber());
            launch.setMissionName(launchParcel.getMissionName());
            launch.setLaunchYear(launchParcel.getLaunchYear());
            launch.setLaunchDateUtc(launchParcel.getLaunchDateUtc());
        }
    }
}
