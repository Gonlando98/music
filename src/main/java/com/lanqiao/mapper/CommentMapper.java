package com.lanqiao.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.lanqiao.model.Comment;



@Mapper
public interface CommentMapper {

    //插入一条记录
    public int insertComment(Comment record);

    //根据音乐的id查询该音乐下的所有评论
    public List<Comment> selectAllComment(Integer commentmid);
    
    //根据commentid评论的id进行更新赞的数量
  	public void updateCommPraise(@Param("count") Integer count,@Param("commentid") Integer commentid);

  	//查询歌曲的总数和总播放量
  	public List<Map<String,String>> totalCounts();
  	//查询用户总量
  	public Integer totalUser();
  	
  //查询MV总量
  	public Integer totalMv();
  	
  	//查询歌单总量
  	public Integer totalAlbum();
  
}