package com.train.universitymap.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.train.universitymap.entity.University;
import com.train.universitymap.entity.User;
import com.train.universitymap.service.UniversityService;
import com.train.universitymap.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MapController {

    @Autowired
    private UserService userService;

    @Autowired
    private UniversityService universityService;
    //用于登录页面的跳转显示
    @GetMapping("/login")
    public String loginShow(){
        return "login";
    }

    //用于登录的校验
    @PostMapping("/check")
    @ResponseBody
    public int loginCheck(String account,String password){
       return userService.loginCheck(account,password);
    }

    //返回主页面
    @GetMapping("/index")
    public String indexShow(){
        return "index";
    }

    //返回地图页面
    @GetMapping("/map1")
    public String mapShow(){
        return "map2.html";
    }

    //路线规划页面
    @GetMapping("/query3")
    public String luxian(){ return "query.html";}


    //查询高校
    @GetMapping("/query")
    @ResponseBody
    public Page<University> queryUniversityByName(Integer pageNumber,String name){
        System.out.println("query,name="+name);
        return universityService.queryUniversityByName(pageNumber,name);
    }

    //通过id查询高校信息
    @GetMapping("/query1")
    @ResponseBody
    public University queryUniversityById(Integer id){
        return universityService.queryUniversityById(id);
    }

    @PostMapping ("/register")
    @ResponseBody
    public int registerShow(String account,String password){
        return userService.addUser(account,password);
    }
}
