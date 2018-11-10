package com.ashushgmail.avihay.laborpains;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

/**
 * Created by avihay on 09/11/2018.
 */

public class TimeViewHolder extends RecyclerView.ViewHolder {

    private TextView dataTextView;

    public TimeViewHolder(@NonNull View itemView) {
        super(itemView);
        dataTextView = itemView.findViewById(R.id.time_data);
    }

    public void bindView(TimeData timeData, int positionInList){
        dataTextView.setText(timeData.getData());
        setItemViewHeight(timeData);
        setItemViewBGColor(positionInList);
    }

    private void setItemViewHeight(TimeData timeData) {
        RecyclerView.LayoutParams params = (RecyclerView.LayoutParams) itemView.getLayoutParams();
        params.height = convertDpToPixels(itemView.getContext(), timeData.getTimeLength() + 14);
        itemView.setLayoutParams(params);
    }

    public int convertDpToPixels(Context context, float dp) {
        float scale = context.getResources().getDisplayMetrics().density;
        return (int) (dp * scale);
    }

    private void setItemViewBGColor(int positionInList) {
        if(positionInList % 2 == 0){
            itemView.setBackgroundColor(getColor(android.R.color.holo_purple));
        } else {
            itemView.setBackgroundColor(getColor(android.R.color.holo_blue_dark));
        }
    }

    private int getColor(int colorId){
        return ContextCompat.getColor(itemView.getContext(),colorId);
    }
}
