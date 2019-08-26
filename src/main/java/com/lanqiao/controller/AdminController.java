package com.lanqiao.controller;
import java.io.File;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.jaudiotagger.audio.AudioFileIO;
import org.jaudiotagger.audio.mp3.MP3AudioHeader;
import org.jaudiotagger.audio.mp3.MP3File;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import net.sourceforge.pinyin4j.format.exception.BadHanyuPinyinOutputFormatCombination;

<<<<<<< HEAD
import com.lanqiao.model.Album;
=======
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
>>>>>>> branch 'master' of https://github.com/Gonlando98/music.git
import com.lanqiao.model.Music;
import com.lanqiao.model.Singer;
import com.lanqiao.model.User;
import com.lanqiao.service.AdminService;
import com.lanqiao.util.Commons;



@RestController
@RequestMapping("/admin")
public class AdminController {
	@Autowired
	private AdminService adminService;
	@Autowired
	private AdminController adminController;
	
	private com.lanqiao.util.Pinyin4j py =new com.lanqiao.util.Pinyin4j();

	@RequestMapping("/selectUser")
	public  PageInfo selectUser(Integer cp){
		if(cp==null){
			cp=1;
		}
		
		PageHelper.startPage(cp, Commons.pageSize);
		List<User> list = adminService.selectAll();
		for (User user : list) {
			/*		System.out.println(user.getUsername());*/
					if ("1".equals(user.getUsertype())) {
						user.setUsertype("普通用户");
					} else {
						user.setUsertype("管理员");
					}
					if ("1".equals(user.getUserstatus())) {
						user.setUserstatus("不可用");
					} else {
						user.setUserstatus("可用");
					}
				
				
					
				}
		PageInfo page = new PageInfo(list);
		
		return page;
	}
	/*public List<User> selectUser(){
		List<User> list = adminService.selectAll();
		
		for (User user : list) {

			if ("1".equals(user.getUsertype())) {
				user.setUsertype("普通用户");
			} else {
				user.setUsertype("管理员");
			}
			if ("1".equals(user.getUserstatus())) {
				user.setUserstatus("不可用");
			} else {
				user.setUserstatus("可用");
			}
		
		
			
		}
		return list;
	} */
	/**
	 * 
	 * @param user
	 * @return改变用户或者管理员的状态
	 */
	@RequestMapping("/updateStatus")
	public String updateStatus(User user){
		System.out.println("sd" + user.getUserstatus());
		if ("不可用".equals(user.getUserstatus())) {
			user.setUserstatus("2");
		} else {
			user.setUserstatus("1");
		}
		int a= adminService.updateStatus(user);
	
		return 	"success";
		
	}
	
/***********************************歌曲管管理******************************************/	
	/**
	 * 查找所以歌曲
	 * @return
	 */
	@GetMapping("/musicList")
	public  PageInfo loadList(Integer cp){
		if(cp==null){
			cp=1;
		}
		
		PageHelper.startPage(cp, Commons.pageSize);
		List<Music> musicAll = adminService.selectAllMusic();
		PageInfo page = new PageInfo(musicAll);
		
		return page;
	}

	/*@GetMapping("/musicList")
	public List<Music> loadList(){
		return adminService.selectAllMusic();
		
		
	}*/
	
	
	/**
	 * 
	 * @param list 歌曲ID的集合
	 * @return 删除歌曲
	 */
	@GetMapping("/deleteMusic")
	public String delete(@RequestParam(value="list[]") Integer[] list){
		for (int i=0;i<list.length;i++) {
			System.out.println(list[i]);
			
			adminService.deleteByPrimaryKey(list[i]);
		}
		/*listService.selectlist()*/
		return "success";
	}
	
	
	/**musicList
	 * 添加g歌曲
	 * @param music
	 * @param file
	 * @return
	 */
	@PostMapping("/addMusic")
	public String addMusic(Music music,@RequestParam("file")
	MultipartFile file,@RequestParam(value="myear1") String myear1){
		System.out.println("myear"+ myear1);
		/*Date date=new Date(myear1);myear1.format(date);*/
		 
	
		try {
	
			
			File ff =new File("D:/music/song/"+file.getOriginalFilename());
			file.transferTo(ff);
			
			MP3File mp3File = (MP3File) AudioFileIO.read(ff);
	        MP3AudioHeader audioHeader = (MP3AudioHeader) mp3File.getAudioHeader();

	      /*  int intLen = audioHeader.getTrackLength(); 单位是秒*/
	        String duration = audioHeader.getTrackLengthAsString();
	        music.setDuration(duration);
	        music.setLocation("http://localhost:8086/song/"+file.getOriginalFilename());
			/*System.out.println("音乐长度" + length);*/
		/*	music.setMyear(new Date());*/
	        
	        Date date =new SimpleDateFormat("yyyy-MM-dd").parse(myear1);
	        
	        music.setMyear(date);
			System.out.println(music);
			adminService.insert(music);
		} catch ( Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return "success";
		
	}
	/**
	 * 根据主键获取music  然后显示在修改页面
	 * @param mid
	 * @return
	 */
	@GetMapping("/selectMusic")
	public Music alterMusic(Integer mid){
		Music music = adminService.selectByPrimaryKey(mid);
		System.out.println(music);
		return music;
		
	}
	/**
	 * 修改歌曲
	 * @param music
	 * @return  
	 */
	@PutMapping("/alterMusic")
	public String alterMusic(@RequestParam("file")
	MultipartFile file, Music music ,@RequestParam(value="myear1") String myear1){
			/*try {
				System.out.println(myear1+  "  myear");
				System.out.println("musicadd ssd " + music+file.getOriginalFilename());
				music.setLocation("/song/"+music+file.getOriginalFilename());
				 Date date = new SimpleDateFormat("yyyy-MM-dd").parse(myear1);
				music.setMyear(date);
				adminService.alterMusic(music);
			} catch (ParseException e) {
				e.printStackTrace();
			}
		
		
		return null;*/
		try {
			File ff =new File("D:/music/song/"+file.getOriginalFilename());
			file.transferTo(ff);
			
			MP3File mp3File = (MP3File) AudioFileIO.read(ff);
	        MP3AudioHeader audioHeader = (MP3AudioHeader) mp3File.getAudioHeader();

	        String duration = audioHeader.getTrackLengthAsString();
	        music.setDuration(duration);
	        music.setLocation("http://localhost:8086/song/"+file.getOriginalFilename());
			
	        Date date =new SimpleDateFormat("yyyy-MM-dd").parse(myear1);
	        
	        music.setMyear(date);
			System.out.println(music);
			adminService.alterMusic(music);
		} catch ( Exception e) {
		
			e.printStackTrace();
		}
		
		return "success";
		
	}
	
	/****************************歌手管理*******************/
	

	/**
	 * 查找所有歌手，把歌手名显示在添加歌曲的页面
	 * @return
	 */
	@GetMapping("/singer")
	public  PageInfo selectSinger(Integer cp){
		if(cp==null){
			cp=1;
		}
		
		PageHelper.startPage(cp, Commons.pageSize);
		List<Singer> a = adminService.selectAllSinger();
		for (Singer singer : a) {
			if (singer.getDetail().length()>6) {
				singer.setDetail(singer.getDetail().substring(0,5)+"......");
			}
			
		}
		PageInfo<Singer> page = new PageInfo<Singer>(a);
		return page;
		
		
	}
	/*public List<Singer> selectSinger(){
		List<Singer> a =  adminService.selectAllSinger();
		for (Singer singer : a) {
			if (singer.getDetail().length()>6) {
				singer.setDetail(singer.getDetail().substring(0,5)+"......");
			}
			
		}
		System.out.println(a);
		return a;
	}*/
	/**
	 * 增加singer
	 * @param singer
	 * @return
	 */
	@PostMapping("/addSinger")
	public String addSinger(Singer singer, @RequestParam("file")
	MultipartFile file){
		System.out.println("singer " + singer);
		try {
			String firstname = py.toPinYinUppercaseInitials(singer.getSname()).toUpperCase();
			System.out.println(firstname+  "  name");
			/*singer.setSreserve(firstname);
			adminService.addSinger(singer);*/
			
			
			
		} catch (BadHanyuPinyinOutputFormatCombination e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "success";	
		
	}
	/**
	 * 修改
	 * @param singer
	 * @return
	 */
	@GetMapping("/selectSingerById")
	public Singer selectSingerById(Integer sid){
		System.out.println(adminService.selectSingerByPrimaryKey(sid));
		return adminService.selectSingerByPrimaryKey(sid);
	}
	@GetMapping("/updateSinger")
	public String updateSinger(Singer singer){
		System.out.println(singer);
		String firstname;
		try {
			firstname = py.toPinYinUppercaseInitials(singer.getSname()).toUpperCase();
			System.out.println(firstname+  "  name");
			singer.setSreserve(firstname);
			adminService.updateByPrimaryKey(singer);
		} catch (BadHanyuPinyinOutputFormatCombination e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
		
		return "success";
	}
	/**
	 * 传歌手的ID 删除歌手  同时删除该歌手的所以歌曲  mv暂时不删
	 * @param singer
	 * @return
	 */
	@DeleteMapping("/deleteSinger")
/*	@RequestMapping(value = "/deleteSinger/{sid}",method = RequestMethod.DELETE)*/

	public String deleteSinger( Integer sid){
		adminService.deleteSinger(sid);
		adminService.deleteMusic(sid);
		return "success";
	}
	
	
	
}
