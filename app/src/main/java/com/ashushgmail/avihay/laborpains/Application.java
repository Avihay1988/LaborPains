package com.ashushgmail.avihay.laborpains;

/**
 * Created by avihay on 10/11/2018.
 */

public class Application extends android.app.Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Prefs.getInstance(getApplicationContext());
    }
}
