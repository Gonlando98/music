package com.lanqiao.controller;

import java.io.File;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.lanqiao.model.Singer;
import com.lanqiao.model.User;

import com.lanqiao.service.Singer1Service;
import com.lanqiao.service.User1Service;
import com.lanqiao.util.Commons;

import net.sourceforge.pinyin4j.format.exception.BadHanyuPinyinOutputFormatCombination;

//后端登录注册管理代码
@RestController
@RequestMapping("/adminB")
public class UserController1 {
	//调用的是user
	@Autowired 
	private User1Service uService;
		
	//调用的是歌手里边的。
	@Autowired	
	private Singer1Service s1Service;
	
	//调用公共里边的内容，达到汉字拼音转换成首拼音大写
	private com.lanqiao.util.Pinyin4j py =new com.lanqiao.util.Pinyin4j();
	
	@GetMapping("/user")
	public String login(User user){	
		System.out.println(user);
		User user1 = uService.loginAll(user);
		if(user1==null){
			return "username_or_password_no";//表示用户或密码不正确或不存在
			}else{
				if(user1.getUsertype().equals(Commons.admintype_admin)){
					if(user1.getUserstatus().equals(Commons.adminstatus)){
							return "success";//表示是管理员可用
						}
						else{
							return "status_no"; //表示是管理员处于不可用状态
						}
					}
				
				else{
						return "no_admin"; //不是管理员，不能进后台
					}
			}
	}
	
	@GetMapping("/register")	
	public String register(User user){	
		//时间:什么时间注册就是什么时间。java.util.Date
		Date date = new Date();
		
		user.setCreatetime(date);
		
		//后台注册时就是管理员，所有默认为管理员。		
		user.setUsertype(Commons.admintype_admin);
		//此时代表管理员未激活，不可用
		user.setUserstatus(Commons.adminstatus_no);
		uService.register(user);		
		return "success" ;
	}

	//增加歌手
	@PostMapping("/upload")
	public String upload(@RequestParam("file") MultipartFile file,String sname,String sex,String type,String detail,Singer singer){
		String firstname = null;
		try {			
			firstname = py.toPinYinUppercaseInitials(singer.getSname()).toUpperCase();
//			for (MultipartFile file : files) {
				File newfile = new File("D:/music/img/"+file.getOriginalFilename());	
//				E:/upload/
				file.transferTo(newfile);
//				System.out.println(newfile);
//				F:\html文件存储\manage1\static\grass

//				System.out.println("F:\html文件存储\manage1\static\"+file.getOriginalFilename());
//				F:\html文件存储\vuefirst\static
				singer.setSname(sname);
				singer.setSex(sex);
				singer.setSimg("http://localhost:8086/img/"+file.getOriginalFilename());
				singer.setDetail(detail);
				singer.setType(type);
				singer.setSreserve(firstname);
				s1Service.addSinger(singer);
				
//			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "success";
		
		
		

		
	}
	
	
	
	
	

}
