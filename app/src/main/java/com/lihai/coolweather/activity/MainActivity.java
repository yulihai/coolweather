package com.lihai.coolweather.activity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;

import com.lihai.coolweather.R;

/**
 * Created by LiHai on 2017/1/26.
 */
public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(this);
        if (prefs.getString("weather" ,null)!= null){
            Intent intent = new Intent(this , WeatherActivity.class);
            startActivity(intent);
            finish();
        }
    }
}
