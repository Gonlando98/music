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
  //ces
    int updateByPrimaryKey(User record);

	int updateStatus(User user);

	List<User> selectUserByName(String username);
	
	//登陆注册用
		User selectByUsername(String username);
	    void updatestatus(User user);
		
		void  active(User user);
		User login (User user);

		User loginAll(User user);

		void register(User user);
}