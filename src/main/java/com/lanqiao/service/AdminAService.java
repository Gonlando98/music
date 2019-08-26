package com.lanqiao.service;

import java.util.List;

import com.lanqiao.model.Album;
import com.lanqiao.model.Music;
import com.lanqiao.model.Mv;
import com.lanqiao.model.Singer;
import com.lanqiao.model.User;

public interface AdminAService {

	List<Album> selectAllAlbum();

	int deleteByPrimaryKey(Integer aid);

	Album selectAlbumById(Integer aid);

	int addAlbum(Album album);

	List<Mv> mvList();

	int deleteMv(Integer mvid);

	void addMV(Mv mv);

	List<User> selectUserByName(String username);

	List<Music> selectMusicByName(String mname);

	List<Album> selectAlbumByName(String aname);

	List<Mv> selectMvByname(String mvname);

	List<Singer> selectSingerByName(String sname);

	Mv selectMvById(Integer mvid);

	void updateMv(Mv mv);

}
