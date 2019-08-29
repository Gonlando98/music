package com.lanqiao.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lanqiao.model.Music;
import com.lanqiao.model.Mv;
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
	
	@PostMapping("/playMV")
	public Mv playMV(String mvname){
		System.out.println(mvname);
		return adminService.playMV(mvname);
		
		
	}
	
	@GetMapping("/playmusicid")
	public  Music playMusicid (Integer mid){
		System.out.println(mid);
		return adminService.playMusicid(mid);
		 
		
	}
	
	
	
	
}
