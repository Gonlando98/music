package com.lanqiao.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lanqiao.mapper.UserMapper;
import com.lanqiao.model.User;
import com.lanqiao.service.UserService;

/**
* @author 范朋欣:
* @version 创建时间：2019年8月22日 上午11:29:03
* 类说明
*/
@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserMapper userMapper;
	
	@Override
	public User selectByUsername(String username) {
	return 	userMapper.selectByUsername(username);
	}

	@Override
	public User login(User user) {
		return userMapper.login(user);
	}

	@Override
	public void register(User user) {
		userMapper.insert(user);
		
	}

	@Override
	public void active(User user) {
		// TODO Auto-generated method stub
		userMapper.active(user);
		
	}
	

}
