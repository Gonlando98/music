package com.lanqiao.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lanqiao.model.Album;
import com.lanqiao.service.AdminAService;


@RestController
@RequestMapping("/adminA")
public class AdminAController {
	@Autowired
	private AdminAService adminAService;
	/**
	 * 查找所有专辑
	 * @return
	 */
	@GetMapping("/albumList")
	public List<Album> selectAllAlbum(){
		
		List<Album> list = adminAService.selectAllAlbum();
		System.out.println(list);
		return list;
		
	}
	 
	@DeleteMapping("deleteAlbum")
	public String deleteAlbum(Integer aid){
		
		adminAService.deleteByPrimaryKey(aid);
		return null;
		
		
		
	}
	
}
