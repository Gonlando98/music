package com.lanqiao.mapper;

import com.lanqiao.model.User;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
@Mapper
public interface UserMapper {
    int deleteByPrimaryKey(Integer uid);

    int insert(User record);

    User selectByPrimaryKey(Integer uid);

    List<User> selectAll();

    int updateByPrimaryKey(User record);

	int updateStatus(User user);
}