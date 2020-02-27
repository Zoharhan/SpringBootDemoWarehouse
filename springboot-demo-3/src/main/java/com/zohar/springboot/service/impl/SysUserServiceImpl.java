package com.zohar.springboot.service.impl;

import com.zohar.springboot.mapper.SysUserMapper;
import com.zohar.springboot.pojo.SysUser;
import com.zohar.springboot.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SysUserServiceImpl implements SysUserService {

    @Autowired
    SysUserMapper sysUserMapper;

    /**
     * 获取用户列表
     * @return
     */
    @Cacheable(value ={"userlist"} )
    public List<SysUser> getUserList() {
        System.out.println("执行来查询的方法");
        List<SysUser> sysUserList = sysUserMapper.getSysUserList();
        return sysUserList;
    }

    /**
     * 根据ID获取用户信息
     *
     * @param id
     * @return
     */
    @Override
    @Cacheable(value = {"user"})
    public SysUser getUserById(String id) {
        System.out.println("执行了根据ID查询用户信息都方法");

        return sysUserMapper.getSysUserById(id);
    }
}
