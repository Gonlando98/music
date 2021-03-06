package com.lanqiao.mapper;

import com.lanqiao.model.Music;
import com.lanqiao.model.Mv;
import com.lanqiao.model.Singer;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MvMapper {
    int deleteByPrimaryKey(Integer mvid);

    int insert(Mv record);

    Mv selectByPrimaryKey(Integer mvid);

    List<Mv> selectAll();

    int updateByPrimaryKey(Mv record);
    
  //ces
    int selectMvCountBysid(Integer sid);

    List<Mv> selectAllmv();

	List<Mv> selectLocalmv(String type);

	List<Mv> selectStypemv(String type);

	List<Mv> mvList();

	List<Mv> selectMvByname(String mvname);
	
	 Mv playMv(String mvname);

}