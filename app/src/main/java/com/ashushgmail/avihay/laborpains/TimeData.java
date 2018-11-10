package com.ashushgmail.avihay.laborpains;

/**
 * Created by avihay on 09/11/2018.
 */

public class TimeData {
    private int timeLength;
    private String data;

    public TimeData(int timeLength, String data) {
        this.timeLength = timeLength;
        this.data = data;
    }

    public int getTimeLength() {
        return timeLength;
    }

    public String getData() {
        return data;
    }
}
