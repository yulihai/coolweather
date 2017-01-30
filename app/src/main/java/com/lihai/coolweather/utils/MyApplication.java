package com.lihai.coolweather.utils;

import android.app.Application;
import android.content.Context;

import org.litepal.LitePal;
import org.litepal.LitePalApplication;

/**
 * Created by LiHai on 2017/1/26.
 */
public class MyApplication extends Application {
    private static Context context;

    @Override
    public void onCreate() {
        super.onCreate();
        context = getApplicationContext();
        //LitePal.initialize(context);
        LitePalApplication.initialize(context);

    }

    public static Context getContext(){
        return context;
    }



}
