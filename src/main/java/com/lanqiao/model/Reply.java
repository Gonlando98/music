package com.lanqiao.model;

public class Reply {
    private Integer replyid;	//回复的id
    private Integer replyuid;	//回复用户的id
    private String replyname;	//回复用户的名字
    private Integer replycomid;	//回复所在的评论id
    private String replycomname;	//评论人的名字
	private String replycontent;	//回复的内容
    private String replytime;	//回复的时间
    private Integer replypraise ;//回复获得赞的数量
    
    
    
    public Integer getReplypraise() {
		return replypraise;
	}

	public void setReplypraise(Integer replypraise) {
		this.replypraise = replypraise;
	}

	public String getReplycomname() {
		return replycomname;
	}

	public void setReplycomname(String replycomname) {
		this.replycomname = replycomname;
	}
    public Integer getReplyid() {
        return replyid;
    }

    public void setReplyid(Integer replyid) {
        this.replyid = replyid;
    }

    public Integer getReplyuid() {
        return replyuid;
    }

    public void setReplyuid(Integer replyuid) {
        this.replyuid = replyuid;
    }

    public Integer getReplycomid() {
        return replycomid;
    }

    public void setReplycomid(Integer replycomid) {
        this.replycomid = replycomid;
    }

    public String getReplyname() {
        return replyname;
    }

    public void setReplyname(String replyname) {
        this.replyname = replyname == null ? null : replyname.trim();
    }

    public String getReplycontent() {
        return replycontent;
    }

    public void setReplycontent(String replycontent) {
        this.replycontent = replycontent == null ? null : replycontent.trim();
    }

    public String getReplytime() {
        return replytime;
    }

    public void setReplytime(String replytime) {
        this.replytime = replytime == null ? null : replytime.trim();
    }
}