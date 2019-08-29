package com.lanqiao.controller;


import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lanqiao.model.Comment;
import com.lanqiao.model.Reply;
import com.lanqiao.service.CommentService;


@RestController
public class CommentController {
	
	@Autowired
	private CommentService commentService;
	
	//根据音乐id查询所有 的评论
	@RequestMapping("/queryAllComment")
	public List<Comment> queryAllComment(Integer id){
		return commentService.queryAllComment(id);
	}
	
	
	//将评论插入到数据库comment表中
	@GetMapping("/comment")
	public void insert(Comment comment){
		commentService.insert(comment);
	}
	
	//将回复插入到回复表reply中
	@RequestMapping("/reply")
	public void insert(Reply reply){
		System.out.println("replycomid  :"+reply.getReplycomid());
		System.out.println("replycomname  :"+reply.getReplycomname());
		System.out.println("replyname  :"+reply.getReplyname());
		System.out.println("replycontent  :"+reply.getReplycontent());
		System.out.println("replytime  :"+reply.getReplytime());
		commentService.insertReply(reply);
	}
	
	//根据评论的id,commentid更新赞的数量
	@RequestMapping("/update")
	public void updateCommPraise(Integer count,Integer commentid){
		System.out.println("count  :"+count);
		System.out.println("commentid  :"+commentid);
		commentService.updateCommPraise(count,commentid);
	}
	

	//查询在线用户的数量
	@RequestMapping("/onlineUser")
	public String login(HttpSession session){
		
		Set<String> set = (Set<String>)session.getServletContext().getAttribute("set");
		return ""+set.size();

	}
	
	
	//获取到歌曲的歌曲的总数和总播放量
	@RequestMapping("/totalCounts")
	public List<Map<String,String>> totalCounts(){
		System.out.println(commentService.totalCounts().toString());
		//输入的结果为：[{tatal=3, counts=147}]
		return commentService.totalCounts();
	}
	
	//获取到用户的总人数
	@RequestMapping("/totalUser")
	public Integer totalUser(){
		System.out.println("用户总数： "+commentService.totalUser());
		return commentService.totalUser();
	}
	
	//获取到MV的总数
		@RequestMapping("/totalMv")
		public Integer totalMv(){
			System.out.println("MV总数： "+commentService.totalMv());
			return commentService.totalMv();
		}
		
		//获取到歌单总数
		@RequestMapping("/totalAlbum")
		public Integer totalAlbum(){
			//commentService.totalAlbum();
			System.out.println("用户总数： "+commentService.totalAlbum());
			return commentService.totalAlbum();
		}

}
