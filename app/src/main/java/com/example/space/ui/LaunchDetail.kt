package com.example.space.ui

import android.os.Bundle
import android.util.Log
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.space.Models.Launch
import com.example.space.R

class LaunchDetail : AppCompatActivity() {
    private var mLaunch: Launch? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_launch_detail)
        setLayout()
        extras
    }

    private fun setLayout() {
        val missionName = findViewById<TextView>(R.id.mission_name_two)
        missionName.text = mLaunch!!.missionName
        //                missionName = findViewById(R.id.mission_name_two),
//                launchYear = findViewById(R.id.regime),
//                launchDate;
    }

    //            mLaunch.setFlightNumber(launchParcel.getFlightNumber());
//            mLaunch.setMissionName(launchParcel.getMissionName());
//            mLaunch.setLaunchYear(launchParcel.getLaunchYear());
//            mLaunch.setLaunchDateUtc(launchParcel.getLaunchDateUtc());
    private val extras: Unit
        private get() {
            if (intent.hasExtra("launch_selected")) {
                val missionName: TextView = intent.getStringExtra("")
                val launchParcel: Launch = intent.getParcelableExtra("launch_selected")
                mLaunch = launchParcel
                Log.d("launchdetail", mLaunch!!.missionName)
                Toast.makeText(this, mLaunch!!.missionName, Toast.LENGTH_LONG).show()
                //            mLaunch.setFlightNumber(launchParcel.getFlightNumber());
//            mLaunch.setMissionName(launchParcel.getMissionName());
//            mLaunch.setLaunchYear(launchParcel.getLaunchYear());
//            mLaunch.setLaunchDateUtc(launchParcel.getLaunchDateUtc());
            }
        }
}