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
        if (intent.hasExtra("")){
            setLayout()
        }
    }

    private fun setLayout() {

        val missionName = intent.getStringExtra("")


        }
}