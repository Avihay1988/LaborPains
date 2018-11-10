package com.ashushgmail.avihay.laborpains;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

/**
 * Created by avihay on 09/11/2018.
 */

public class TimeRecyclerAdapter extends RecyclerView.Adapter<TimeViewHolder>{

    ArrayList<TimeData> dataItems;

    public TimeRecyclerAdapter(ArrayList<TimeData> dataItems) {
        this.dataItems = dataItems;
    }

    @NonNull
    @Override
    public TimeViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.time_view_holder, viewGroup, false);
        return new TimeViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull TimeViewHolder timeViewHolder, int i) {
        timeViewHolder.bindView(dataItems.get(i), i);
    }

    @Override
    public int getItemCount() {
        return dataItems.size();
    }
}
