package com.lanqiao.model;

public class Singer {
    private Integer sid;

    private String sname;

    private String sex;

    private String type;

    private String simg;

    private String detail;

    private String sreserve;

    private String sreserve2;

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname == null ? null : sname.trim();
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getSimg() {
        return simg;
    }

    public void setSimg(String simg) {
        this.simg = simg == null ? null : simg.trim();
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail == null ? null : detail.trim();
    }

    public String getSreserve() {
        return sreserve;
    }

    public void setSreserve(String sreserve) {
        this.sreserve = sreserve == null ? null : sreserve.trim();
    }

    public String getSreserve2() {
        return sreserve2;
    }

    public void setSreserve2(String sreserve2) {
        this.sreserve2 = sreserve2 == null ? null : sreserve2.trim();
    }

	@Override
	public String toString() {
		return "Singer [sid=" + sid + ", sname=" + sname + ", sex=" + sex + ", type=" + type + ", simg=" + simg
				+ ", detail=" + detail + ", sreserve=" + sreserve + "]";
	}
}