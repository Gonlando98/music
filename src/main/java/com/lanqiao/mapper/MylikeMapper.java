package com.lanqiao.mapper;

import com.lanqiao.model.Mylike;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
@Mapper
public interface MylikeMapper {
    int deleteByPrimaryKey(Integer lid);

    int insert(Mylike record);

    Mylike selectByPrimaryKey(Integer lid);

    List<Mylike> selectAll();

    int updateByPrimaryKey(Mylike record);
}