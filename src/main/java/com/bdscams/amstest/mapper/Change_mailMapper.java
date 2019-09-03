package com.bdscams.amstest.mapper;

import com.bdscams.amstest.entity.Change_mail;

public interface Change_mailMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Change_mail record);

    int insertSelective(Change_mail record);

    Change_mail selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Change_mail record);

    int updateByPrimaryKey(Change_mail record);
}