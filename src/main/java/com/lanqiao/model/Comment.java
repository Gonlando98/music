package com.lanqiao.model;

import java.util.List;

public class Comment {
    private Integer commentid;  //评论的id
    private Integer commentmid;	//评论音乐的id
    private Integer commentuid;	//评论人的id
    private String commentname;	//评论人的用户名
    private String commenttime;	//评论的时间
    private String commentcontent;	//评论的内容
    private Integer commpraise;	//评论获得的赞的数量
    public Integer getCommpraise() {
		return commpraise;
	}

	public void setCommpraise(Integer commpraise) {
		this.commpraise = commpraise;
	}

	private List<Reply> replys;		//评论回复的集合
    
    public Integer getCommentid() {
        return commentid;
    }

    public void setCommentid(Integer commentid) {
        this.commentid = commentid;
    }

    public Integer getCommentmid() {
        return commentmid;
    }

    public void setCommentmid(Integer commentmid) {
        this.commentmid = commentmid;
    }

    public List<Reply> getReplys() {
		return replys;
	}

	public void setReplys(List<Reply> replys) {
		this.replys = replys;
	}

	public Integer getCommentuid() {
        return commentuid;
    }

    public void setCommentuid(Integer commentuid) {
        this.commentuid = commentuid;
    }

    public String getCommentname() {
        return commentname;
    }

    public void setCommentname(String commentname) {
        this.commentname = commentname == null ? null : commentname.trim();
    }

    public String getCommenttime() {
        return commenttime;
    }

    public void setCommenttime(String commenttime) {
        this.commenttime = commenttime == null ? null : commenttime.trim();
    }

    public String getCommentcontent() {
        return commentcontent;
    }

    public void setCommentcontent(String commentcontent) {
        this.commentcontent = commentcontent == null ? null : commentcontent.trim();
    }
}