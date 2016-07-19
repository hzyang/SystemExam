package com.xiaoyang.admin.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xiaoyang.admin.exception.UserException;
import com.xiaoyang.admin.mapper.SysUserMapper;
import com.xiaoyang.admin.model.SysUser;
import com.xiaoyang.admin.service.UserService;
/**
 * User实现类.
 * 
 * @author zyhe
 *
 */
@Service("UserService")
public class UserServiceeImpl implements UserService{
    
    @Autowired
    private SysUserMapper sysUserMapper;
    
    public int insert(SysUser sysUser) throws UserException {
        return sysUserMapper.insert(sysUser);
    }

}
