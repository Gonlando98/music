package com.lanqiao.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lanqiao.model.User;
import com.lanqiao.service.UserService;
import com.lanqiao.util.EMail;


@RestController
public class UserController {
	
	@Autowired
	private UserService userservice;
	
	@GetMapping("/login")
	public String login(User user,HttpSession session){
	User tuser = userservice.login(user);
	
	if(tuser==null){
		return "用户名或密码错误！！。。。。。。";
	}
	
	else{
		if("2".equals(tuser.getUserstatus())){
			session.setAttribute("user", tuser);
			System.out.println(session.getId()+"存放时");
			/*System.out.println(session.getId());
			User user1=(User) session.getAttribute("user");
			System.out.println(user1.getUsername()+"登陆时");*/
			return "登陆成功";
		}
		else{
			return "用户被禁用";
		}

	}

	}
	@GetMapping("/register")
	public String  register(User user){
		user.setCreatetime(new Date());
		user.setUserstatus("1");
		user.setUsertype("1");
		userservice.register(user);
		EMail mail = new EMail();
		System.out.println("邮箱");
		mail.setSubject("音乐网站账户激活");
		String str = "点击如下的链接，激活账号<br> "
				+ "<a href='http://127.0.0.1:8086/active?username="+user.getUsername()+"'>点击</a>";
		mail.setContent(str);
		//收件人 可以发给其他邮箱(163等) 下同
		mail.setTo(new String[] {user.getEmail()});
		
		//发送邮件
		try {
			mail.sendMessage();
			System.out.println("发送邮件成功！");
			return "注册成功,请前去激活";
		} catch (Exception e) {
			System.out.println("发送邮件失败！");
			return "发送邮件失败，请重新注册";
			
		}
		
		
		
	}
	@GetMapping("/active")
	public void active(User user,HttpServletResponse response) throws IOException{
		System.out.println("激活");
		user.setUserstatus("2");
		userservice.active(user);
		
		PrintWriter out = response.getWriter();
		out.println ("<script language=javascript>alert('账户激活成功！！');</script>");
		
		
		
	}
	@GetMapping("/info")
	public User getinfo(HttpSession session){
		System.out.println("查询session");
		User user=(User) session.getAttribute("user");
		System.out.println("查询"+user.getUsername());
		System.out.println(session.getId());
		System.out.println(user+"下次");
		return user;
		
		
	}
	@GetMapping("/logout")
	public  String logout(HttpSession session){
		
		session.removeAttribute("user");
		System.out.println(session.getId()+"logout");
		return "success";
		
	}
	@GetMapping("/getsessionuser")
	public User getsessionUser(HttpSession session){
		User user=(User) session.getAttribute("user");
		System.out.println(session.getId()+"获取时");
		return user;
	}

}
