package com.lanqiao.mapper;

import com.lanqiao.model.Album;
import com.lanqiao.model.Music;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MusicMapper {
    int deleteByPrimaryKey(Integer mid);

    int insert(Music record);

    Music selectByPrimaryKey(Integer mid);

    List<Music> selectAll();

    int selectMusicCountBysid(Integer sid);
    
    int updateByPrimaryKey(Music record);

    
    List<Music> selectMusicBysid(Integer sid);

   
    List<Music> selectHotList();

	List<Music> selectPopList();

	List<Music> selectLoadList();

	List<Music> selectRthkList();

	List<Music> selectEurUsaList();

	List<Music> selectlist();

	List<Music> selectfpub(String type);

	List<Album> selectfalbum();

	List<Music> selectAllMusic();

	int deleteMusicBySid(Integer sid);

	List<Music> selectMusicByName(String mname);
	
	List<Music> selectmusiclist(String mreserve2);




}