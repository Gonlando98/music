package com.lanqiao.mapper;

import com.lanqiao.model.Musiclist;
import java.util.List;

public interface MusiclistMapper {
    int deleteByPrimaryKey(Integer lid);

    int insert(Musiclist record);

    Musiclist selectByPrimaryKey(Integer lid);

    List<Musiclist> selectAll();

    int updateByPrimaryKey(Musiclist record);
}