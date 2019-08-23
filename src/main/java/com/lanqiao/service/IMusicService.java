package com.lanqiao.service;

import java.util.List;

import com.lanqiao.model.Music;

public interface IMusicService {
	
	public int selectMusicCountBysid(Integer sid);
	
	public List<Music> selectMusicBysid(Integer sid);
}
