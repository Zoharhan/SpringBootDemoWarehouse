package com.zohar.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class IndexController {

    @GetMapping("/index")
    public String index(Model model){
        System.out.println("进入index界面");
        model.addAttribute("index","这里是index界面");
        return "index";
    }

    @ResponseBody
    @GetMapping("/success")
    public tmp success(Model model){
        System.out.println("进入Success界面");
        model.addAttribute("success","这里是成功界面");

        tmp tmp = new tmp();
        tmp.setName("白梓墨");
        tmp.setAge("20");

//返回值如果是对象的话，可以直接返回json数据
        return tmp;
    }




    class tmp{
        private String name;

        private String age;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getAge() {
            return age;
        }

        public void setAge(String age) {
            this.age = age;
        }
    }
}
