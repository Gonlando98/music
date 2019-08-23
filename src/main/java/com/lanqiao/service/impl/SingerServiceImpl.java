package com.lanqiao.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lanqiao.mapper.SingerMapper;
import com.lanqiao.model.Singer;
import com.lanqiao.service.ISingerService;
@Service
public class SingerServiceImpl implements ISingerService{
	
	@Autowired
	private SingerMapper mapper;
	@Override
	public List<Singer> selectAll() {
		
		return mapper.selectAll();
	}
	@Override
	public List<Singer> selectAllByFw(String fw) {
		// TODO Auto-generated method stub
		return mapper.selectAllByFw(fw);
	}
	@Override
	public List<Singer> selectByType(String a, String b) {
		// TODO Auto-generated method stub
		return mapper.selectByType(a,b);
	}
	@Override
	public Singer selectByPrimaryKey(Integer sid) {
		// TODO Auto-generated method stub
		return mapper.selectByPrimaryKey(sid);
	}
	

}
