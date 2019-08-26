package com.lanqiao.model;

public class Musiclist {
    private Integer lid;

    private String limg;

    private String lname;

    private String lintro;

    public Integer getLid() {
        return lid;
    }

    public void setLid(Integer lid) {
        this.lid = lid;
    }

    public String getLimg() {
        return limg;
    }

    public void setLimg(String limg) {
        this.limg = limg == null ? null : limg.trim();
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname == null ? null : lname.trim();
    }

    public String getLintro() {
        return lintro;
    }

    public void setLintro(String lintro) {
        this.lintro = lintro == null ? null : lintro.trim();
    }
}