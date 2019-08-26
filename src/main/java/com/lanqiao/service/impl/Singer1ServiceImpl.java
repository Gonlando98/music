package com.lanqiao.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lanqiao.mapper.SingerMapper;
import com.lanqiao.model.Singer;
import com.lanqiao.service.Singer1Service;

@Service
public class Singer1ServiceImpl implements Singer1Service{
	@Autowired 
	private SingerMapper s1Mapper;

	@Override
	public void addSinger(Singer record) {
		s1Mapper.addSinger(record);
		
	}

}
