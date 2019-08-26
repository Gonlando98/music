package com.lanqiao.test;

import java.util.List;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.lanqiao.controller.AdminController;
import com.lanqiao.mapper.UserMapper;
import com.lanqiao.model.Album;
import com.lanqiao.model.User;



@RunWith(SpringRunner.class)
@SpringBootTest
public class Test {
	
	@Autowired
	private UserMapper mapper;
	@Autowired
	private AdminController a ;
	@Autowired
	private AdminController  adminAController;
	
	@org.junit.Test
	public void insert(){
		List<User> list = a.selectUser();
		/*System.out.println(list);*/
		for (User user : list) {
			System.out.println(user.getUsername());
		}
	}
	
	
	
	/*@org.junit.Test
	public void updateStatus(){
		User user = new User();
		user.setUid(1);
		user.setUserstatus("1");

		List<User> list=a.updateStatus(user);
		System.out.println(list);

		int v = a.updateStatus(user);
		System.out.println(v);

	}
	*/
}
