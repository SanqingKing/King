package com.ziweiking.utils;

import com.alibaba.druid.pool.DruidDataSource;
import com.ziweiking.POJO.SetDataSource;

import javax.sql.DataSource;

public class KingObjects {

    /**
     * 获取一个数据源对象，后续通过SetDataSource对象的属性设置数据源的属性
     * */
    public static DataSource getDataSource(SetDataSource source){
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setDriverClassName(source.getDriverName());
        dataSource.setUrl(source.getUrlLocalhost());
        dataSource.setUsername(source.getUsername());
        dataSource.setPassword(source.getPassword());
        return dataSource;
    }


}
