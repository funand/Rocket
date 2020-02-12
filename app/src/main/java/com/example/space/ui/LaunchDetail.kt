package com.example.space.ui

import android.os.Bundle
import android.util.Log
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.space.Models.Launch
import com.example.space.R
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.activity_launch_detail.*
import kotlinx.android.synthetic.main.launchitems.view.*

class LaunchDetail : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_launch_detail)
        if (intent.hasExtra("missionName")){
            setLayout()
        }
    }

    private fun setLayout() {
        if(intent.hasExtra("image")){
            val imageUri = intent.getStringExtra("image")
            imageUri?.let { image ->
                Picasso.get().load(image).fit().into(rocket_img_two as ImageView)
            }
        }
        mission_name_two.text = intent.getStringExtra("missionName")
        rocket_name_two.text = intent.getStringExtra("rocket")
        date_launched.text = intent.getStringExtra("date")
        regime.text = intent.getStringExtra("regime")
        manufacturer.text = intent.getStringExtra("manufacturer")
        reference_system.text = intent.getStringExtra("reference")
    }
}

