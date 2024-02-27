package com.example.graduationprojectspringboot.controller;

import com.example.graduationprojectspringboot.pojo.Users;
import com.example.graduationprojectspringboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/user")
@ResponseBody
public class UserController {

    @Autowired
    UserService service;

    @GetMapping("selectById")
    public Users selectById(@RequestParam("id") int id){
        return service.selectById(id);
    }

    @GetMapping("selectAll")
    public List<Users> selectAll(){
        return service.selectAll();
    }
}
