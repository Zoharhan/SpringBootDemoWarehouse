package com.zohar.springboot.mapper;

import com.zohar.springboot.pojo.SysUser;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface SysUserMapper {

    @Select("SELECT * FROM `sys_user`")
    public List<SysUser> getSysUserList();
}
