package com.example.coolweather1.db;

import org.litepal.crud.DataSupport;

/**
 * Created by HP on 2018/1/2.
 */

public class County extends DataSupport {
    private int id;
    private  String countyName;
    private  String weatherId;
    private int cityId;
    private String coutyName;

    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id=id;
    }
    public String getcountyName(){
        return countyName;
    }
    public void setcountyName(String countyName){
        this.countyName=countyName;
    }
    public String getWeatherId(){
        return weatherId;
    }
    public void setWeatherId(String weatherId){
        this.weatherId=weatherId;
    }
    public int getCityId(){
        return cityId;
    }
    public void setCityId(int cityId){
        this.cityId=cityId;
    }

    public String getCoutyName() {
        return coutyName;
    }
}

