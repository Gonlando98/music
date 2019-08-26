package com.lanqiao.service;

import java.util.List;

import com.lanqiao.model.User;

public interface User1Service {
	//登录时进行查询时使用。
	User loginAll(User user);
	//注册时进行插入使用
	int insert(User record);
	void register(User user);
}
