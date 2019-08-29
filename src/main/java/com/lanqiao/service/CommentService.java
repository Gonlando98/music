package com.lanqiao.service;

import java.util.List;
import java.util.Map;

import com.lanqiao.model.Comment;
import com.lanqiao.model.Reply;


public interface CommentService {
	//通过音乐的id获取该音乐下的评论
		public List<Comment> queryAllComment(Integer mid);

		//插入一条评论
		public void insert(Comment comment);
		//插入一条评论的回复
		public void insertReply(Reply reply);
		
		//根据评论的id更新赞的数量
		public void updateCommPraise(Integer count, Integer commentid);
		
		//查询歌曲的总数和总播放量
		public List<Map<String,String>> totalCounts();
		//查询用户总数
		public Integer totalUser();
		
		//查询MV总量
	  	public Integer totalMv();
	  	
	  	//查询歌单总量
	  	public Integer totalAlbum();
		
}
