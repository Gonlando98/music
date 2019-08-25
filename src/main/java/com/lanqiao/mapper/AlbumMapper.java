package com.lanqiao.mapper;

import com.lanqiao.model.Album;
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
//ces
	List<Album> selectAlbumByName(String aname);
}