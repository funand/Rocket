package com.example.space.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

import com.example.space.Models.Launch;
import com.example.space.R;
import com.example.space.viewModel.LaunchViewModel;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private LaunchViewModel launchViewModel;
    private LaunchAdapter launchAdapter;
    private List<Launch> dataset;
    private boolean mTwoPane;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_launch_list);

        if (findViewById(R.id.song_detail_containers) != null) {
            mTwoPane = true;
        }
        initRecycleView();
        createViewModel();
    }

    private void initRecycleView() {
        dataset = new ArrayList<Launch>();
        launchAdapter = new LaunchAdapter(this, mTwoPane);
        RecyclerView recyclerView = findViewById(R.id.recycle_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(launchAdapter);
    }

    private void createViewModel() {
        launchViewModel = ViewModelProviders.of(this).get(LaunchViewModel.class);
        launchViewModel.getLaunches().observe(this, allLaunches -> {
            populateUI(allLaunches);
        });
    }

    private void populateUI(List<Launch> allLaunches) {
        dataset = launchViewModel.getSortedLaunchList(allLaunches);
        launchAdapter.updateDataSet(allLaunches);
    }
}
