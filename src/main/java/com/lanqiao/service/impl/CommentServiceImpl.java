package com.lanqiao.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lanqiao.mapper.CommentMapper;
import com.lanqiao.mapper.ReplyMapper;
import com.lanqiao.model.Comment;
import com.lanqiao.model.Reply;
import com.lanqiao.service.CommentService;



@Service
public class CommentServiceImpl implements CommentService{
	
	@Autowired
	private CommentMapper commentMapper;
	
	@Autowired
	private ReplyMapper replyMapper;
	
	
	//通过音乐的id获取该音乐下的评论
	@Override
	public List<Comment> queryAllComment(Integer mid){
		return commentMapper.selectAllComment(mid);
	}

	//插入一条评论
	@Override
	public void insert(Comment comment) {
		commentMapper.insertComment(comment);
		
	}
	//插入一条评论的回复
	@Override
	public void insertReply(Reply reply) {
		replyMapper.insertReply(reply);
	}
	
	//根据评论的id更新赞的数量
	@Override
	public void updateCommPraise(Integer count, Integer commentid) {
		commentMapper.updateCommPraise(count, commentid);
		
	}
	
	//查询歌曲的总数和总播放量
	@Override
	public List<Map<String,String>> totalCounts(){
		return commentMapper.totalCounts();
	}
	//查询用户总数
	@Override
	public Integer totalUser(){
		return commentMapper.totalUser();
	}
	


	//查询mv总数
	@Override
	public Integer totalMv() {
		return commentMapper.totalMv();
	}

	//查询歌单总数
	@Override
	public Integer totalAlbum() {
		return commentMapper.totalAlbum();
	}
	
}
