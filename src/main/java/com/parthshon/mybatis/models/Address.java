package com.parthshon.mybatis.models;

public class Address {

    private int aptnumber;
    private String aptname;
    private String city;
    private String state;

    public int getAptnumber() {
        return aptnumber;
    }

    public void setAptnumber(int aptnumber) {
        this.aptnumber = aptnumber;
    }

    public String getAptname() {
        return aptname;
    }

    public void setAptname(String aptname) {
        this.aptname = aptname;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    private String date;
}
