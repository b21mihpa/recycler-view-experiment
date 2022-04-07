package com.example.recyclerviewexperiment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<String> mountains = Arrays.asList("Mount Everest", "K2", "Kangchenjunga", "Lhotse", "Makalu", "Cho Oyu", "Manaslu");

        recyclerView = findViewById(R.id.my_recycler_view);
        MountainAdapter mountainAdapter = new MountainAdapter(mountains);
        recyclerView.setAdapter(mountainAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
    }
}