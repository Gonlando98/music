package com.lanqiao.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lanqiao.mapper.MusicMapper;
import com.lanqiao.model.Music;
import com.lanqiao.service.IMusicService;
@Service
public class MusicServiceImpl implements IMusicService {
	@Autowired
	private MusicMapper mapper;
	@Override
	public int selectMusicCountBysid(Integer sid) {
		// TODO Auto-generated method stub
		return mapper.selectMusicCountBysid(sid);
	}
	@Override
	public List<Music> selectMusicBysid(Integer sid) {
		// TODO Auto-generated method stub
		return mapper.selectMusicBysid(sid);
	}
	@Override
	public List<Music> selectMusicByAid(Integer aid) {
		// TODO Auto-generated method stub
		return mapper.selectMusicByAid(aid);
	}

}
