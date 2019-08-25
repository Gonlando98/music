package com.lanqiao.controller;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.lanqiao.model.Album;
import com.lanqiao.model.Music;
import com.lanqiao.model.Mv;
import com.lanqiao.model.Singer;
import com.lanqiao.model.User;
import com.lanqiao.service.AdminAService;

import net.sourceforge.pinyin4j.format.exception.BadHanyuPinyinOutputFormatCombination;

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
	 /**
	  * 删除专辑
	  * @param aid
	  * @return
	  */
	@DeleteMapping("deleteAlbum")
	public String deleteAlbum(Integer aid){
		
		adminAService.deleteByPrimaryKey(aid);
		return "success";
		
	}
	@GetMapping("/selectAlbumById")
	public Album selectAlbumById(Integer aid){
		return adminAService.selectAlbumById(aid);
		
	}
	/**
	 * 添加专辑
	 * @param file
	 * @param album
	 * @return
	 */
	
	@PostMapping("/addAlbum")
	public String addAlbum(@RequestParam("file") MultipartFile file,Album album){
		File ff =new File("D:/music/img/"+file.getOriginalFilename());
		try {
			file.transferTo(ff);
			album.setAimg("http://localhost:8086/img/"+file.getOriginalFilename());
			System.out.println(album);
			adminAService.addAlbum(album);
			
		} catch (IllegalStateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return "success";
		
	}
	/**********************mv*****************************/
	/**
	 * 查找mv
	 * @return
	 */
	@GetMapping("/mvList")
	public List<Mv> mvList(){
		List<Mv> list = adminAService.mvList();
		System.out.println(list);
		return list;
		
	}
/*	添加*/
	@GetMapping("/selectMvById")
	public Mv selectMvById(Integer mvid){
		return adminAService.selectMvById(mvid);
		
	}
	@GetMapping("/updateMv")
	public String updateMv(Mv mv){
		adminAService.updateMv(mv);
		
		return null;
		
		}
	/**
	 * 删除mv
	 * @param mvid
	 * @return
	 */
	@DeleteMapping("/deleteMv")
	public String deleteMv(Integer mvid){
		adminAService.deleteMv(mvid);
		
		return null;
		
	}
	
	@PostMapping("/addMV")
	public String addMv(Mv mv,@RequestParam("file") MultipartFile file,
			@RequestParam("fileimg") MultipartFile fileimg){
		
		try {
			File ff =new File("D:/music/img/"+fileimg.getOriginalFilename());
			fileimg.transferTo(ff);
			File fff =new File("D:/music/mv/"+file.getOriginalFilename());
			file.transferTo(fff);
			System.out.println("mv  " +mv);
			System.out.println(fileimg.getOriginalFilename());
			System.out.println(file.getOriginalFilename());
			mv.setMimg("http://localhost:8086/img/"+fileimg.getOriginalFilename());
			mv.setMlocation("http://localhost:8086/mv/"+fileimg.getOriginalFilename());
			adminAService.addMV(mv);
			
		} catch (IllegalStateException | IOException e) {
			
			e.printStackTrace();
		}
		
		return null;
	}

	/**************搜索 ****************************/
	/**
	 * 管理员搜索
	 * @param username
	 * @return
	 */
	@GetMapping("/userSelect")
	public List<User> selectUserByName(String username){
		return adminAService.selectUserByName(username);
	}
	/**
	 * 歌曲查找
	 * @param mname
	 * @return
	 */
	@GetMapping("/musicSelect")
	public List<Music> selectMusicByName(String mname){
		return adminAService.selectMusicByName(mname);
	}
	/**
	 * 专辑
	 * @param aname
	 * @return
	 */
	@GetMapping("/albumSelect")
	public List<Album> selectAlbumByName(String aname){
		return adminAService.selectAlbumByName(aname);
	}
	/**
	 * mv管理
	 * @param mvname
	 * @return
	 */
	@GetMapping("/mvSelect")
	public List<Mv> selectMvByname(String mvname){
		return adminAService.selectMvByname(mvname);
		
	}
	
	@GetMapping("/singerSelect")
	public List<Singer> selectSinger(String sname){
		return adminAService.selectSingerByName(sname);
		
	}
}