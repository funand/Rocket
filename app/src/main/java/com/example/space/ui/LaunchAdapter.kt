package com.example.space.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.example.space.Models.Launch
import com.example.space.R
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.launchitems.view.*


class LaunchAdapter(var launchListener: OnLaunchListener) : RecyclerView.Adapter<LaunchAdapter.ViewHolder>(){

    private var dataset: List<Launch> = emptyList()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(
                R.layout.launchitems, parent, false)
        return ViewHolder(view, launchListener)
    }

    override fun getItemCount(): Int = dataset.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(dataset.get(position))
    }

    fun updateDataSet(updatedDataset: List<Launch>) {
        dataset = updatedDataset
        notifyDataSetChanged()
    }

    class ViewHolder(itemView: View, var launchListener: OnLaunchListener) : RecyclerView.ViewHolder(itemView), View.OnClickListener {

        fun bind(launch: Launch) {
            val imageUri = launch.getLinks().getMissionPatchSmall()
            Picasso.get().load(imageUri).fit().into(itemView.rocket_img as ImageView)
            itemView.mission_name.text = launch.missionName
            itemView.rocket_name.text = launch.rocket.rocketName
            itemView.launch_name.text = launch.launchSite.siteName
            itemView.date_launched.text = launch.launchYear
            itemView.setOnClickListener(this)
        }

        override fun onClick(view: View?) {
            launchListener.onLaunchClick(adapterPosition)
        }
    }

    interface OnLaunchListener{
        fun onLaunchClick(position : Int)
    }

}
