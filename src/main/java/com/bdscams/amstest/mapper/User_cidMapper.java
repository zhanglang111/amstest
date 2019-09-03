package com.bdscams.amstest.mapper;

import com.bdscams.amstest.entity.User_cid;

public interface User_cidMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(User_cid record);

    int insertSelective(User_cid record);

    User_cid selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User_cid record);

    int updateByPrimaryKey(User_cid record);
}