package com.lanqiao.model;

public class Mylike {
    private Integer lid;

    private Integer mid;

    private String mname;

    private String username;

    private String mreserve;

    public Integer getLid() {
        return lid;
    }

    public void setLid(Integer lid) {
        this.lid = lid;
    }

    public Integer getMid() {
        return mid;
    }

    public void setMid(Integer mid) {
        this.mid = mid;
    }

    public String getMname() {
        return mname;
    }

    public void setMname(String mname) {
        this.mname = mname == null ? null : mname.trim();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getMreserve() {
        return mreserve;
    }

    public void setMreserve(String mreserve) {
        this.mreserve = mreserve == null ? null : mreserve.trim();
    }
}