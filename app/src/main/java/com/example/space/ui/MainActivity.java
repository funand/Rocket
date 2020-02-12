package com.example.space.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import com.example.space.Models.Launch;
import com.example.space.R;
import com.example.space.viewModel.LaunchViewModel;

import java.util.List;

public class MainActivity extends AppCompatActivity implements LaunchAdapter.OnLaunchListener {
    private LaunchViewModel launchViewModel;
    private LaunchAdapter launchAdapter;
    private List<Launch> dataset;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initRecycleView();
        createViewModel();
    }

    private void initRecycleView() {
        launchAdapter = new LaunchAdapter(this);
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

    @Override
    public void onLaunchClick(int position) {
        Intent intent = new Intent(this, LaunchDetail.class);

        intent.putExtra("image", dataset.get(position).getLinks().getMissionPatchSmall());
        intent.putExtra("missionName", dataset.get(position).getMissionName());
        intent.putExtra("rocket", dataset.get(position).getRocket().getRocketName());
        intent.putExtra("date", dataset.get(position).getLaunchYear());

        intent.putExtra("regime", dataset.get(position).getRocket()
                .getSecondStage().getPayloads().get(0).getOrbitParams().getRegime());
        intent.putExtra("manufacturer", dataset.get(position).getRocket()
                .getSecondStage().getPayloads().get(0).getManufacturer());
        intent.putExtra("reference", dataset.get(position).getRocket()
                .getSecondStage().getPayloads().get(0).getOrbitParams().getReferenceSystem());


        startActivity(intent);
    }
}
