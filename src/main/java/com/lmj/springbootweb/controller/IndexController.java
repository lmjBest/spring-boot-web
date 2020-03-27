package com.lmj.springbootweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

@Controller
public class IndexController {

    @ResponseBody
    @RequestMapping("/hello")
    public String hello(){
        return "这是我的第一个springboot项目!";
    }

    @RequestMapping("/come")
    public String index(Map<String,Object> map){
        map.put("user","小明");
        return "come";
    }
}
