package com.bdscams.amstest.mapper;

import com.bdscams.amstest.entity.Apply_friend;

public interface Apply_friendMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Apply_friend record);

    int insertSelective(Apply_friend record);

    Apply_friend selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Apply_friend record);

    int updateByPrimaryKey(Apply_friend record);
}