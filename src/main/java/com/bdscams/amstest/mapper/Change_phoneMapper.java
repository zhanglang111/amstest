package com.bdscams.amstest.mapper;

import com.bdscams.amstest.entity.Change_phone;

public interface Change_phoneMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Change_phone record);

    int insertSelective(Change_phone record);

    Change_phone selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Change_phone record);

    int updateByPrimaryKey(Change_phone record);
}