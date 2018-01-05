package com.example.coolweather1.gson;

import com.example.coolweather1.pojo.Update;
import com.google.gson.annotations.SerializedName;

/**
 * Created by HP on 2018/1/4.
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
