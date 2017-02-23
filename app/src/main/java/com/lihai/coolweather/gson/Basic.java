package com.lihai.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by LiHai on 2017/1/31.
 */
public class Basic {
    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update{
        @SerializedName("loc")
        public String updateTime;
    }
}
