package com.bdscams.amstest.mapper;

import com.bdscams.amstest.entity.Opt_right;

public interface Opt_rightMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Opt_right record);

    int insertSelective(Opt_right record);

    Opt_right selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Opt_right record);

    int updateByPrimaryKey(Opt_right record);
}