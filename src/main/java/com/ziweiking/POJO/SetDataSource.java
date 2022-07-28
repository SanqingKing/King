package com.ziweiking.POJO;

public class SetDataSource {
    private String driver;
    private String url;
    private String username;
    private String password;

    private static String driverName="com.mysql.cj.jdbc.Driver";
    private String urlLocalhostMysql="jdbc:mysql://localhost:3306/";
    private String urlTable=null;
    private String urlLocalhost;

    public void setUrlTable(String urlTable) {
        this.urlTable = urlTable;
    }

    public String getUrlLocalhost() {
        return urlLocalhostMysql+urlTable;
    }

    public SetDataSource() {
    }

    public SetDataSource(String urlTable, String username, String password) {
        this.username = username;
        this.password = password;
        this.urlTable = urlTable;
    }

    public SetDataSource(String driver, String url, String username, String password) {
        this.driver = driver;
        this.url = url;
        this.username = username;
        this.password = password;
    }

    public String getDriverName() {
        return driverName;
    }

    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
