package com.example.john.fivemonth;

import android.app.Application;

import org.xutils.x;

/**
 * Created by john on 2018/5/9.
 */

public class MyApplication extends Application{
    @Override
    public void onCreate() {
        super.onCreate();
        x.Ext.init(this);
        x.Ext.setDebug(BuildConfig.DEBUG);

    }
}
