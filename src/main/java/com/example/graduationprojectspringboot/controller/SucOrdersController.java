package com.example.graduationprojectspringboot.controller;

import com.example.graduationprojectspringboot.pojo.SucOrders;
import com.example.graduationprojectspringboot.service.SucOrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@Controller
@ResponseBody
@RequestMapping("sucOrders")
public class SucOrdersController {
    @Autowired
    SucOrdersService service;

    @GetMapping("selectAll")
    public List<SucOrders> selectAll(){
        return service.selectAll();
    }

    @GetMapping("selectById")
    public SucOrders selectById(@RequestParam("id") int id){
        return service.selectById(id);
    }

    @GetMapping("selectByUId")
    public SucOrders selectByUId(@RequestParam("uId")int uId){
        return service.selectByUId(uId);
    }

    @GetMapping("selectByDate")
    @CrossOrigin
    public List<Map<String,Object>> selectByDate(){
        System.out.println("selectByDate");
        return service.selectByDate();
    }
}
