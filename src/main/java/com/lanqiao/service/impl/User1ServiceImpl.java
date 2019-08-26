package com.lanqiao.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lanqiao.mapper.UserMapper;
import com.lanqiao.model.User;
import com.lanqiao.service.User1Service;

@Service
public class User1ServiceImpl implements User1Service{
	
	@Autowired
	private UserMapper umapper;

	@Override
	public User loginAll(User user) {
		// TODO Auto-generated method stub
		return umapper.loginAll(user);
	}

	@Override
	public int insert(User record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void register(User user) {
		umapper.register(user);
		
	}

	

	
}
