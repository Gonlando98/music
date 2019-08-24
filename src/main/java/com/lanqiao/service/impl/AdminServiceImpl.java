package com.lanqiao.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lanqiao.mapper.MusicMapper;
import com.lanqiao.mapper.SingerMapper;
import com.lanqiao.mapper.UserMapper;
import com.lanqiao.model.Music;
import com.lanqiao.model.Singer;
import com.lanqiao.model.User;
import com.lanqiao.service.AdminService;


@Service
public class AdminServiceImpl implements AdminService{
	@Autowired
	private UserMapper userMapper;
	@Autowired
	
	private MusicMapper musicMapper;
	
	@Autowired
	private SingerMapper singerMapper;

	@Override
	public List<User> selectAll() {
		
		return userMapper.selectAll();
	}

	@Override
	public int updateStatus(User user) {
		return userMapper.updateStatus(user);
		
	}

	@Override
	public void deleteByPrimaryKey(int mid) {
		musicMapper.deleteByPrimaryKey(mid);
		
	}

	@Override
	public List<Singer> selectAllSinger() {
		// TODO Auto-generated method stub
		return singerMapper.selectAll();
	}

	@Override
	public void addMusic(Music music) {
		musicMapper.insert(music);
		
		
	}

	@Override
	public Music selectByPrimaryKey(Integer mid) {
		// TODO Auto-generated method stub
		return  musicMapper.selectByPrimaryKey(mid);
	}

	@Override
	public void updateByPrimaryKey(Music music) {
		musicMapper.updateByPrimaryKey(music);
		
		
		
	}

	@Override
	public int insert(Music music) {
		// TODO Auto-generated method stub
		return musicMapper.insert(music);
	}

	@Override
	public List<Music> selectAllMusic() {
		// TODO Auto-generated method stub
		return musicMapper.selectAllMusic();
	}

	@Override
	public void addSinger(Singer singer) {
		singerMapper.insert(singer);
		
		
	}

	@Override
	public void updateByPrimaryKey(Singer singer) {
		singerMapper.updateByPrimaryKey(singer);
		
	}

	@Override
	public void deleteSinger(Integer sid) {
		singerMapper.deleteByPrimaryKey(sid);
		
	}

	@Override
	public void deleteMusic(Integer sid) {
		musicMapper.deleteMusicBySid(sid);
		
	}

	@Override
	public Singer selectSingerByPrimaryKey(Integer sid) {
		// TODO Auto-generated method stub
		return singerMapper.selectByPrimaryKey(sid);
	}

	@Override
	public void alterMusic(Music music) {
		musicMapper.updateByPrimaryKey(music);
		
	}
}
