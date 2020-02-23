package com.example.space.ui


import android.graphics.Color
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.space.R
import kotlinx.android.synthetic.main.launch_detail.view.*

/**
 * A simple [Fragment] subclass.
 */
class LaunchFragment() : Fragment() {

    private var mission: String = ""
    private var rocket: String = ""
    private var date: String = ""
    private var regime: String = ""
    private var manufacturer: String = ""
    private var reference: String = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        arguments?.let {
            if (it.containsKey("mission_name_two")) {
                mission = getArguments()?.getString("mission_name_two") ?: "mission"
                rocket = getArguments()?.getString("rocket") ?: "rocket"
                date = getArguments()?.getString("date") ?: "date"
                regime = getArguments()?.getString("regime") ?: "regime"
                manufacturer = getArguments()?.getString("manufacturer") ?: "manufacturer"
                reference = getArguments()?.getString("reference") ?: "reference"
            }
        }
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {

        // Inflate the layout for this fragment.
        val rootView: View = inflater.inflate(R.layout.launch_detail,
                container, false)

        rootView.setBackgroundColor(Color.GRAY)
        mission?.let { missionName -> rootView.mission_name_two.text = missionName }
        rocket?.let { rocket -> rootView.rocket_name_two.text = rocket }
        date?.let { it -> rootView.date_launched.text = it }
        regime?.let { it -> rootView.regime.text = it }
        manufacturer?.let { it -> rootView.manufacturer.text = it }
        reference?.let { it -> rootView.reference_system.text = it }

        return rootView
    }
}
