package com.zohar.springboot.controller;

import com.zohar.springboot.pojo.SysUser;
import com.zohar.springboot.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class IndexController {

    @Autowired
    SysUserService userService;

    @ResponseBody
    @GetMapping("/")
    public String toIndex(){
        return "Hello World";
    }

    @ResponseBody
    @GetMapping("/UserList")
    public List<SysUser> getUserList(){
        List<SysUser> sysUserList = userService.getUserList();
        return sysUserList;
    }
    @ResponseBody
    @GetMapping("/user")
    public SysUser getUserById(String id){
        return userService.getUserById(id);
    }
}
