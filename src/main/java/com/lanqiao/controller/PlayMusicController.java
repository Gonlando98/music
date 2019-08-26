package com.lanqiao.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lanqiao.model.Music;
import com.lanqiao.service.AdminService;

@RestController

public class PlayMusicController {
	
	@Autowired
	private AdminService adminService;
	
	
	/**
	 * 根据歌名获取歌的信息并播放
	 * @param music
	 * @return  
	 */
	@GetMapping("/playmusic")
	public  Music playMusic (String mname){
		System.out.println(mname);
		return adminService.playMusic(mname);
		 
		
	}
}
