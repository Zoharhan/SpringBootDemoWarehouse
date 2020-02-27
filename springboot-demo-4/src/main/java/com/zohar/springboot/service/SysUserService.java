package com.zohar.springboot.service;

import com.zohar.springboot.pojo.SysUser;

import java.util.List;

public interface SysUserService {
    /**
     * 获取用户列表
     * @return
     */
    public List<SysUser> getUserList();

    /**
     * 根据ID获取用户信息
     * @param id
     * @return
     */
    public SysUser getUserById(String id);
}
