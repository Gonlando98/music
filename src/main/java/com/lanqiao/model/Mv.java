package com.lanqiao.model;

public class Mv {
    private Integer mvid;

    private String mvname;

    private String mlocation;

    private String mimg;

    private Integer sid;

    private String mvreserve;
    
    private Singer singer;
    
   

	public Singer getSinger() {
		return singer;
	}

	public void setSinger(Singer singer) {
		this.singer = singer;
	}

	public Integer getMvid() {
        return mvid;
    }

    public void setMvid(Integer mvid) {
        this.mvid = mvid;
    }

    public String getMvname() {
        return mvname;
    }

    public void setMvname(String mvname) {
        this.mvname = mvname == null ? null : mvname.trim();
    }

    public String getMlocation() {
        return mlocation;
    }

    public void setMlocation(String mlocation) {
        this.mlocation = mlocation == null ? null : mlocation.trim();
    }

    public String getMimg() {
        return mimg;
    }

    public void setMimg(String mimg) {
        this.mimg = mimg == null ? null : mimg.trim();
    }

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public String getMvreserve() {
        return mvreserve;
    }

    public void setMvreserve(String mvreserve) {
        this.mvreserve = mvreserve == null ? null : mvreserve.trim();
    }
}