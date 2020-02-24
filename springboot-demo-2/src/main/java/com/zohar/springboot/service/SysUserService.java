package com.zohar.springboot.service;

import com.zohar.springboot.mapper.SysUserMapper;
import com.zohar.springboot.pojo.SysUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SysUserService {

    @Autowired
    SysUserMapper sysUserMapper;

    /**
     * 获取用户列表
     * @return
     */
    public List<SysUser> getUserList() {
        List<SysUser> sysUserList = sysUserMapper.getSysUserList();
        return sysUserList;
    }
}
