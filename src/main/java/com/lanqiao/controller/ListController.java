package com.lanqiao.controller;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.ResourceUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
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
//		PageHelper.startPage(1, 6);
//		List<Music> musics =service.selectlist();
//		System.out.println("yinyue"+musics);
//		PageInfo<Music> pageInfo = new PageInfo<>(musics);
//		System.out.println("fenye"+pageInfo);
//		List<Music> aa =pageInfo.getList();
//		System.out.println(aa);
		/*for(Music a:aa){
			System.out.println(a.getMname()+"  "+a.getDuration());
		}*/
		return service.selectlist();
/*15111*/
		/*return service.selectlist();*/
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
	//歌单推荐
	@GetMapping("/musiclist")
	public List<Music> musiclist(String mreserve2){
		System.out.println(mreserve2);
		return service.selectmusiclist(mreserve2);
	}
	//歌单推荐简介
		@GetMapping("/musiclist2")
		public List<Music> musiclist2(String mreserve2){
			System.out.println(mreserve2);
			return service.selectmusiclist2(mreserve2);
		}
	
	@GetMapping("/download")
	 
	public void download(String mname,HttpServletResponse response){
		try {
			String path = "D:/music/song/"+mname+".mp3";
			System.out.println(path);
			File file = new File(path);
			if(!file.exists()){
				response.sendError(404, "下载错误");
				return;
			}
			BufferedInputStream bis = new BufferedInputStream(new FileInputStream(file));
			response.setContentType("multipart/form-data");
			response.setHeader("Content-Disposition", "attachment;filename="+mname+".mp3");
			
			OutputStream out = response.getOutputStream();
			byte [] buff = new byte[1024];
			int len = -1;
			while((len= bis.read(buff))!=-1){
				out.write(buff,0,len);
			}
			bis.close();
			out.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

	
	

}
