package com.lanqiao.service;

import java.util.List;

import com.lanqiao.model.Album;
import com.lanqiao.model.Singer;

public interface IAlbumService {
	
	public int selectCountBySid(Integer sid);
	
	List<Album> selectAlbumByMid(Integer mid);
	
	Album selectByPrimaryKey(Integer aid);
	
	Singer selectSingerByAid(Integer aid);
	
	List<Album> selectAll();
	
}
