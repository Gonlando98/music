package com.lanqiao.mapper;

import com.lanqiao.model.Album;
import com.lanqiao.model.Singer;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
@Mapper
public interface AlbumMapper {
    int deleteByPrimaryKey(Integer aid);

    int insert(Album record);

    Album selectByPrimaryKey(Integer aid);

    List<Album> selectAll();
    
    int selectCountBySid(int sid);
    
    int updateByPrimaryKey(Album record);

	List<Album> selectAllAlbum();

	List<Album> selectAlbumByMid(Integer mid);
	
	Singer selectSingerByAid(Integer aid);

//ces
	List<Album> selectAlbumByName(String aname);

}