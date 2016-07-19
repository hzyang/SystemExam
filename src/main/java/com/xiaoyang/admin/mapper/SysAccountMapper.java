package com.xiaoyang.admin.mapper;

import com.xiaoyang.admin.model.SysAccount;

public interface SysAccountMapper {
    int deleteByPrimaryKey(Integer accountId);

    int insert(SysAccount record);

    int insertSelective(SysAccount record);

    SysAccount selectByPrimaryKey(Integer accountId);

    int updateByPrimaryKeySelective(SysAccount record);

    int updateByPrimaryKey(SysAccount record);
}