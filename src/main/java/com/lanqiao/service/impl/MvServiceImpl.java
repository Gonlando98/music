package com.lanqiao.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lanqiao.mapper.MvMapper;
import com.lanqiao.model.Mv;
import com.lanqiao.model.Singer;
import com.lanqiao.service.MvService;

@Service
public class MvServiceImpl implements MvService{
	@Autowired
	private MvMapper mvmapper;

	@Override
	public int deleteByPrimaryKey(Integer mvid) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insert(Mv record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Mv selectByPrimaryKey(Integer mvid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Mv> selectAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int updateByPrimaryKey(Mv record) {
		// TODO Auto-generated method stubz
		return 0;
	}

	@Override
	public List<Mv> selectAllmv() {
		// TODO Auto-generated method stub
		return mvmapper.selectAllmv();
	}

	@Override
	public List<Mv> selectLocalmv(String type) {
		// TODO Auto-generated method stub
		return mvmapper.selectLocalmv(type);
	}

	@Override
	public List<Mv> selectStypemv(String type) {
		// TODO Auto-generated method stub
		return mvmapper.selectStypemv(type);
	}
	
	public int selectMvCountBysid(Integer sid) {
		// TODO Auto-generated method stub
		return mvmapper.selectMvCountBysid(sid);
	}

}
