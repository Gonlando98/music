package com.lanqiao.service;

import java.util.List;

import com.lanqiao.model.Music;
import com.lanqiao.model.Singer;
import com.lanqiao.model.User;

public interface AdminService {

	List<User> selectAll();

	int updateStatus(User user);

	void deleteByPrimaryKey(int mid);

	List<Singer> selectAllSinger();

	void addMusic(Music music);

	Music selectByPrimaryKey(Integer mid);

	void updateByPrimaryKey(Music music);

	int insert(Music music);

	List<Music> selectAllMusic();

	void addSinger(Singer singer);

	void updateByPrimaryKey(Singer singer);

	void deleteSinger(Integer sid);

	void deleteMusic(Integer sid);

	Singer selectSingerByPrimaryKey(Integer sid);

	void alterMusic(Music music);
	
	Music playMusic(String mname);

}
