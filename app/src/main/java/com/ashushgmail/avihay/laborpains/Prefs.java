package com.ashushgmail.avihay.laborpains;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by avihay on 10/11/2018.
 */

public class Prefs {

    private static Prefs instance;
    private final SharedPreferences prefs;

    private final static String TIME_DATA_LIST_KEY = "TIME_DATA_LIST_KEY";
    private String timeDataList;

    public static Prefs getInstance(Context context) {
        if (instance == null) {
            instance = new Prefs(context.getApplicationContext());
        }
        return instance;
    }

    public Prefs(Context context) {
        prefs = PreferenceManager.getDefaultSharedPreferences(context.getApplicationContext());
        initiate();
    }

    private void initiate() {
        timeDataList = prefs.getString(TIME_DATA_LIST_KEY, "");
    }

    private void save(){
        SharedPreferences.Editor edit = prefs.edit();
        edit.putString(TIME_DATA_LIST_KEY, timeDataList);
        edit.commit();
    }

    public ArrayList<TimeData> getTimeDataList () {
        ArrayList<TimeData> data = new ArrayList<TimeData>();
        if(!timeDataList.equals("")) {
            Gson gson = new Gson();
            Type collectionType = new TypeToken<List<TimeData>>() {
            }.getType();
            data = gson.fromJson(timeDataList, collectionType);
        }
        save();
        return data;
    }
}
