package com.lanqiao.service;

import java.util.List;

import com.lanqiao.model.Album;

public interface AdminAService {

	List<Album> selectAllAlbum();

	int deleteByPrimaryKey(Integer aid);

}
