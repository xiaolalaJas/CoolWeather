package com.zzh.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * Author: zhangzhihua on 17-5-27 16:25
 * Email: zhangzihua@huaqin.com
 */

public class City extends DataSupport
{
    private int id;
    private String cityName;
    private int cityCode;
    private int provinceCode;

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public String getCityName()
    {
        return cityName;
    }

    public void setCityName(String cityName)
    {
        this.cityName = cityName;
    }

    public int getCityCode()
    {
        return cityCode;
    }

    public void setCityCode(int cityCode)
    {
        this.cityCode = cityCode;
    }

    public int getProvinceCode()
    {
        return provinceCode;
    }

    public void setProvinceCode(int provinceCode)
    {
        this.provinceCode = provinceCode;
    }
}
