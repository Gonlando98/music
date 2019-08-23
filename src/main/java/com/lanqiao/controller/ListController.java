package com.lanqiao.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lanqiao.model.Album;
import com.lanqiao.model.Music;
import com.lanqiao.model.Singer;
import com.lanqiao.service.ListService;

@RestController
@RequestMapping("/list")
public class ListController {
	
	@Autowired
	private ListService service;
	
	//新歌榜
	@GetMapping("/newlist")
	public List<Music> newList(){
		return service.selectlist();
	}

	//热歌榜
	@GetMapping("/hotlist")
	public List<Music> hotmusic(){
		return service.selectHotList();
	}
	//流行榜
	@GetMapping("/popmusic")
	public List<Music> popList(){
		return service.selectPopList();
	}
	//内地
	@GetMapping("/mainload")
	public List<Music> loadlist(){
		return service.selectLoadList();
	}
	//欧美
	@GetMapping("/eurusa")
	public List<Music> eurlist(){
		return service.selectEurUsaList();
	}
	//港台
	@GetMapping("/rthk")
	public List<Music> rthkList(){
		return service.selectRthkList();
	}
	//首页新歌首发
	@GetMapping("/fpub")
	public List<Music> Fpub(Singer singer){
		return service.selectfpub(singer.getType());
	}
	//专辑推荐
	@GetMapping("/album")
	public List<Album> album(){
		return service.selectfalbum();
	}
	
	

}
