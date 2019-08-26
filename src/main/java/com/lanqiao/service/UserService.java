package com.lanqiao.service;

import com.lanqiao.model.User;


/**
* @author 范朋欣:
* @version 创建时间：2019年8月22日 上午11:28:43
* 类说明
*/
public interface UserService {
	User login(User user);
	User selectByUsername(String username);
	void register(User user);
	void active(User user);
	
}
