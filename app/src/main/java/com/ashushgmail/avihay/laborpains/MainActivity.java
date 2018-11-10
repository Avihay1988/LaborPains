package com.ashushgmail.avihay.laborpains;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView timeRecyclerView;
    private LinearLayoutManager layoutManager;
    private TimeRecyclerAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        timeRecyclerView = findViewById(R.id.time_recycler);
        adapter = new TimeRecyclerAdapter(generateListForTesing());
        timeRecyclerView.setAdapter(adapter);
        layoutManager = new LinearLayoutManager(this);
        timeRecyclerView.setLayoutManager(layoutManager);
    }

    private ArrayList<TimeData> generateListForTesing(){
        ArrayList<TimeData> bla = new ArrayList<>();
        bla.add(new TimeData(20, "avihay"));
        bla.add(new TimeData(30, "ashush"));
        bla.add(new TimeData(10, "denis"));
        bla.add(new TimeData(40, "rogov"));
        return bla;
    }
}
