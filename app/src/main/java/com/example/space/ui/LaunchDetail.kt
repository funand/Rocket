package com.example.space.ui

import android.content.Intent
import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import com.example.space.R

class LaunchDetail : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_launch_detail)

        if (savedInstanceState == null) {
            // Create instance of the detail fragment and add it to the activity
            // using a fragment transaction.

            val arguments = Bundle()
            arguments.putString("mission_name_two", intent.getStringExtra("mission_name_two"))
            arguments.putString("rocket", intent.getStringExtra("rocket"))
            arguments.putString("date", intent.getStringExtra("date"))
            arguments.putString("regime", intent.getStringExtra("regime"))
            arguments.putString("manufacturer", intent.getStringExtra("manufacturer"))
            arguments.putString("reference", intent.getStringExtra("reference"))

            val fragment = LaunchFragment()
            fragment.arguments = arguments
            supportFragmentManager.beginTransaction()
                    .add(R.id.song_detail_containers, fragment)
                    .commit()
        }
    }

    override fun onOptionsItemSelected(item: MenuItem) =
            when (item.itemId) {
                android.R.id.home -> {
                    navigateUpTo(Intent(this, MainActivity::class.java))
                    true
                }
                else -> super.onOptionsItemSelected(item)
            }
}

