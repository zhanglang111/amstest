package com.bdscams.amstest.mapper;

import com.bdscams.amstest.entity.Opt_log;

public interface Opt_logMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Opt_log record);

    int insertSelective(Opt_log record);

    Opt_log selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Opt_log record);

    int updateByPrimaryKey(Opt_log record);
}