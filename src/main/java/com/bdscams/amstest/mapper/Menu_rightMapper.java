package com.bdscams.amstest.mapper;

import com.bdscams.amstest.entity.Menu_right;

public interface Menu_rightMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Menu_right record);

    int insertSelective(Menu_right record);

    Menu_right selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Menu_right record);

    int updateByPrimaryKey(Menu_right record);
}