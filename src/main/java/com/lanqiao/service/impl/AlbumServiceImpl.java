package com.lanqiao.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lanqiao.mapper.AlbumMapper;
import com.lanqiao.model.Album;
import com.lanqiao.model.Singer;
import com.lanqiao.service.IAlbumService;

@Service
public class AlbumServiceImpl implements IAlbumService {
	@Autowired
	private AlbumMapper mapper;
	@Override
	public int selectCountBySid(Integer sid) {
	
		return mapper.selectCountBySid(sid);
	}
	@Override
	public List<Album> selectAlbumByMid(Integer mid) {
		// TODO Auto-generated method stub
		return mapper.selectAlbumByMid(mid);
	}
	@Override
	public Album selectByPrimaryKey(Integer aid) {
		// TODO Auto-generated method stub
		return mapper.selectByPrimaryKey(aid);
	}
	@Override
	public Singer selectSingerByAid(Integer aid) {
		// TODO Auto-generated method stub
		return mapper.selectSingerByAid(aid);
	}
	@Override
	public List<Album> selectAll() {
		// TODO Auto-generated method stub
		return mapper.selectAll();
	}

}
