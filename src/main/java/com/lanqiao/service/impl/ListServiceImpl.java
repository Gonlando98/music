package com.lanqiao.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lanqiao.mapper.MusicMapper;
import com.lanqiao.model.Album;
import com.lanqiao.model.Music;
import com.lanqiao.service.ListService;

@Service
public class ListServiceImpl implements ListService {
	@Autowired
	private MusicMapper musicMapper;

	@Override
	public int deleteByPrimaryKey(Integer mid) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insert(Music record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Music selectByPrimaryKey(Integer mid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Music> selectAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int updateByPrimaryKey(Music record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Music> selectlist() {
		// TODO Auto-generated method stub
		return musicMapper.selectlist();
	}



	@Override
	public List<Music> selectHotList() {
		// TODO Auto-generated method stub
		return musicMapper.selectHotList();
	}

	@Override
	public List<Music> selectPopList() {
		// TODO Auto-generated method stub
		return musicMapper.selectPopList();
	}

	@Override
	public List<Music> selectLoadList() {
		// TODO Auto-generated method stub
		return musicMapper.selectLoadList();
	}

	@Override
	public List<Music> selectRthkList() {
		// TODO Auto-generated method stub
		return musicMapper.selectRthkList();
	}

	@Override
	public List<Music> selectEurUsaList() {
		// TODO Auto-generated method stub
		return musicMapper.selectEurUsaList();
	}

	@Override
	public List<Music> selectfpub(String type) {
		// TODO Auto-generated method stub
		return musicMapper.selectfpub(type);
	}

	@Override
	public List<Album> selectfalbum() {
		// TODO Auto-generated method stub
		return musicMapper.selectfalbum();
	}

}
