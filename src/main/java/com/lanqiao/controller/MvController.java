package com.lanqiao.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lanqiao.model.Music;
import com.lanqiao.model.Mv;
import com.lanqiao.model.Singer;
import com.lanqiao.service.MvService;

@RestController
@RequestMapping("/mv")
public class MvController {
	
	@Autowired
	private MvService mvservice;
	
	//查询所有MV
	@GetMapping("/allmv")
	public List<Mv> allmv(){
		return mvservice.selectAllmv();
	}
	//按地区查询
	@GetMapping("/local")
	public List<Mv> localmv(Singer singer){
		System.out.println(singer);
		return mvservice.selectLocalmv(singer.getType());
	}
	//按类型查询
	@GetMapping("/mtype")
	public List<Mv> stypemv(String mvreserve){
		
		return mvservice.selectStypemv(mvreserve);
	}
	
}
