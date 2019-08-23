package com.lanqiao.service;

import java.util.List;

import com.lanqiao.model.Album;
import com.lanqiao.model.Music;

public interface ListService {
		int deleteByPrimaryKey(Integer mid);

	    int insert(Music record);

	    Music selectByPrimaryKey(Integer mid);

	    List<Music> selectAll();
	    


	    int updateByPrimaryKey(Music record);



	    
	    List<Music> selectHotList();

		List<Music> selectPopList();

		List<Music> selectLoadList();

		List<Music> selectRthkList();

		List<Music> selectEurUsaList();

		List<Music> selectlist();

		List<Music> selectfpub(String type);

		List<Album> selectfalbum();
	    
	    
}
