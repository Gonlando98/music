package com.lanqiao.service;

import java.util.List;

import com.lanqiao.model.Singer;

public interface ISingerService {
	
	public List<Singer> selectAll();
	
	public List<Singer> selectAllByFw(String fw);
	
	public List<Singer> selectByType(String a,String b);
	
	public Singer selectByPrimaryKey(Integer sid);
}
