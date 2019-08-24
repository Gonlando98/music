package com.lanqiao.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lanqiao.mapper.AlbumMapper;
import com.lanqiao.mapper.MusicMapper;
import com.lanqiao.mapper.MvMapper;
import com.lanqiao.mapper.UserMapper;
import com.lanqiao.model.Album;
import com.lanqiao.model.Music;
import com.lanqiao.model.Mv;
import com.lanqiao.model.User;
import com.lanqiao.service.AdminAService;
@Service
public class AdminAServiceImpl implements AdminAService {
	@Autowired
	private AlbumMapper albumMapper;
	@Autowired
	private UserMapper userMapper;
	@Autowired
	private MvMapper mvMapper;
	@Autowired
	private MusicMapper musicMapper;
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
	@Override
	public Album selectAlbumById(Integer aid) {
		// TODO Auto-generated method stub
		return albumMapper.selectByPrimaryKey(aid);
	}
	@Override
	public int addAlbum(Album album) {
		return albumMapper.insert(album);
		// TODO Auto-generated method stub
		
	}
	@Override
	public List<Mv> mvList() {
		// TODO Auto-generated method stub
		return mvMapper.mvList();
	}
	@Override
	public int deleteMv(Integer mvid) {
		// TODO Auto-generated method stub
		return mvMapper.deleteByPrimaryKey(mvid);
	}
	@Override
	public void addMV(Mv mv) {
		mvMapper.insert(mv);
		
	}
	@Override
	public List<User> selectUserByName(String username) {
		// TODO Auto-generated method stub
		return userMapper.selectUserByName(username);
	}
	@Override
	public List<Music> selectMusicByName(String mname) {
		// TODO Auto-generated method stub
		return musicMapper.selectMusicByName(mname);
	}

}
