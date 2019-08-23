package com.lanqiao.service;

import java.util.List;

import com.lanqiao.model.Mv;


public interface MvService {
	 int deleteByPrimaryKey(Integer mvid);

	    int insert(Mv record);

	    Mv selectByPrimaryKey(Integer mvid);

	    List<Mv> selectAll();

	    int updateByPrimaryKey(Mv record);
	    
	    List<Mv> selectAllmv();

	    public int selectMvCountBysid(Integer sid);
	    
		List<Mv> selectLocalmv(String type);

		List<Mv> selectStypemv(String type);
}
