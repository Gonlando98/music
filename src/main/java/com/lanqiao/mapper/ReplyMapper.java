package com.lanqiao.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.lanqiao.model.Reply;

@Mapper
public interface ReplyMapper {

    //插入一条回复
    public void insertReply(Reply reply);
}