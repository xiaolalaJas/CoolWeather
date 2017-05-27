package com.zzh.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * Author: zhangzhihua on 17-5-27 16:24
 * Email: zhangzihua@huaqin.com
 */

public class Province extends DataSupport
{
    private int id;
    private String provinceName;
    private int provinceCode;

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public String getProvinceName()
    {
        return provinceName;
    }

    public void setProvinceName(String provinceName)
    {
        this.provinceName = provinceName;
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
