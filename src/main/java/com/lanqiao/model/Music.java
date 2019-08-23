package com.lanqiao.model;

import java.util.Date;

public class Music {
    private Integer mid;

    private String mname;

    private Integer sid;

    private Integer count;

    private String type;

    private Date myear;

    private String mimg;

    private String location;

    private Integer aid;

    private Integer mvid;

    private String duration;

    private Integer state;

    private String discuss;
    
    private Singer singer;

    

	public Singer getSinger() {
		return singer;
	}

	public void setSinger(Singer singer) {
		this.singer = singer;
	}

	private String mreserve1;

    private String mreserve2;

    private String mreserve3;

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

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public Date getMyear() {
        return myear;
    }

    public void setMyear(Date myear) {
        this.myear = myear;
    }

    public String getMimg() {
        return mimg;
    }

    public void setMimg(String mimg) {
        this.mimg = mimg == null ? null : mimg.trim();
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location == null ? null : location.trim();
    }

    public Integer getAid() {
        return aid;
    }

    public void setAid(Integer aid) {
        this.aid = aid;
    }

    public Integer getMvid() {
        return mvid;
    }

    public void setMvid(Integer mvid) {
        this.mvid = mvid;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration == null ? null : duration.trim();
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public String getDiscuss() {
        return discuss;
    }

    public void setDiscuss(String discuss) {
        this.discuss = discuss == null ? null : discuss.trim();
    }

    public String getMreserve1() {
        return mreserve1;
    }

    public void setMreserve1(String mreserve1) {
        this.mreserve1 = mreserve1 == null ? null : mreserve1.trim();
    }

    public String getMreserve2() {
        return mreserve2;
    }

    public void setMreserve2(String mreserve2) {
        this.mreserve2 = mreserve2 == null ? null : mreserve2.trim();
    }

    public String getMreserve3() {
        return mreserve3;
    }

    public void setMreserve3(String mreserve3) {
        this.mreserve3 = mreserve3 == null ? null : mreserve3.trim();
    }

	@Override
	public String toString() {
		return "Music [mid=" + mid + ", mname=" + mname + ", sid=" + sid + ", count=" + count + ", type=" + type
				+ ", myear=" + myear + ", mimg=" + mimg + ", location=" + location + ", aid=" + aid + ", mvid=" + mvid
				+ ", duration=" + duration + ", state=" + state + ", discuss=" + discuss + "]";
	}

	
    
}