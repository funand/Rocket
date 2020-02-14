package com.example.space.ui

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.example.space.Models.Launch
import com.example.space.R
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.launchitems.view.*


//class LaunchAdapter(var launchListener: OnLaunchListener,
//                    var parentActivity: MainActivity, var mTwoPane : Boolean) : RecyclerView.Adapter<LaunchAdapter.ViewHolder>() {
class LaunchAdapter(var parentActivity: MainActivity, var mTwoPane: Boolean) : RecyclerView.Adapter<LaunchAdapter.ViewHolder>() {
    private var dataset: List<Launch> = emptyList()


//    private val onClickListener: View.OnClickListener

//    init {
//        onClickListener = View.OnClickListener { v ->
//            val item = v.tag as DummyContent.DummyItem
//            if (twoPane) {
//                val fragment = ItemDetailFragment().apply {
//                    arguments = Bundle().apply {
//                        putString(ItemDetailFragment.ARG_ITEM_ID, item.id)
//                    }
//                }
//                parentActivity.supportFragmentManager
//                        .beginTransaction()
//                        .replace(R.id.item_detail_container, fragment)
//                        .commit()
//            } else {
//                val intent = Intent(v.context, ItemDetailActivity::class.java).apply {
//                    putExtra(ItemDetailFragment.ARG_ITEM_ID, item.id)
//                }
//                v.context.startActivity(intent)
//            }
//        }
//    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(
                R.layout.launchitems, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int = dataset.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        var launch = dataset.get(position)

        launch?.let { itemLaunch ->
            holder.bind(itemLaunch)

            holder.itemView.setOnClickListener(View.OnClickListener { v ->

                if (mTwoPane) {
                    val bundle = Bundle()
                    bundle.putString("mission_name_two", launch.missionName)
                    bundle.putString("rocket", launch.rocket.rocketName)
                    bundle.putString("date", launch.launchYear)
                    bundle.putString("regime", launch.rocket.secondStage.payloads.get(0).orbitParams.regime)
                    bundle.putString("manufacturer", launch.rocket.secondStage.payloads.get(0).manufacturer)
                    bundle.putString("reference", launch.rocket.secondStage.payloads.get(0).orbitParams.referenceSystem)

                    val launchFragment = LaunchFragment()
                    launchFragment.arguments = bundle
                    parentActivity.supportFragmentManager.beginTransaction()
                            .replace(R.id.song_detail_containers, launchFragment)
                            .addToBackStack(null)
                            .commit()
                } else {
                    val intent = Intent(v.context, LaunchDetail::class.java)
                    intent.putExtra("mission_name_two", dataset[position].missionName)
                    intent.putExtra("rocket", dataset[position].rocket.rocketName)
                    intent.putExtra("date", dataset[position].launchYear)
                    intent.putExtra("regime", launch.rocket.secondStage.payloads.get(0).orbitParams.regime)
                    intent.putExtra("manufacturer", launch.rocket.secondStage.payloads.get(0).manufacturer)
                    intent.putExtra("reference", launch.rocket.secondStage.payloads.get(0).orbitParams.referenceSystem)
                    v.context.startActivity(intent)
                }
            })
        }
    }

    fun updateDataSet(updatedDataset: List<Launch>) {
        dataset = updatedDataset
        notifyDataSetChanged()
    }

    //    class ViewHolder(itemView: View, var launchListener: OnLaunchListener) : RecyclerView.ViewHolder(itemView), View.OnClickListener {
    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        fun bind(launch: Launch) {
            val imageUri = launch.getLinks().getMissionPatchSmall()

            imageUri?.let { image ->
                Picasso.get().load(image).fit().into(itemView.rocket_img as ImageView)
            }
            itemView.mission_name.text = launch.missionName
            itemView.rocket_name.text = launch.rocket.rocketName
            itemView.launch_name.text = launch.launchSite.siteName
            itemView.date_launched.text = launch.launchYear
//            itemView.setOnClickListener(this)
        }

//        override fun onClick(view: View?) {
//            if (adapterPosition != -1)
//                launchListener.onLaunchClick(adapterPosition)
//            else
//                launchListener.onLaunchClick(0)
//        }
    }

    interface OnLaunchListener {
        fun onLaunchClick(position: Int)
    }

}
