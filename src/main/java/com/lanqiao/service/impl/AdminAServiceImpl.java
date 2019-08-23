package com.lanqiao.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lanqiao.mapper.AlbumMapper;

import com.lanqiao.model.Album;
import com.lanqiao.service.AdminAService;
@Service
public class AdminAServiceImpl implements AdminAService {
	@Autowired
	private AlbumMapper albumMapper;
	@Override
	public List<Album> selectAllAlbum() {
		// TODO Auto-generated method stub
		List<Album> list = albumMapper.selectAllAlbum();
		return list;
	}
	@Override
	public int deleteByPrimaryKey(Integer aid) {
		// TODO Auto-generated method stub
		return albumMapper.deleteByPrimaryKey(aid);
	}

}
