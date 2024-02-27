package com.example.graduationprojectspringboot.controller;

import com.example.graduationprojectspringboot.pojo.Orders;
import com.example.graduationprojectspringboot.service.OrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("orders")
public class OrdersController {
    @Autowired
    OrdersService service;


    @RequestMapping("selectAll")
    public List<Orders> selectAll(){
        return service.selectAll();
    }

    @RequestMapping("selectByUser")
    public List<Orders> selectByUser(@RequestParam int uId){
        return service.selectByUser(uId);
    }

    @RequestMapping("selectByTime")
    public List<Orders> selectByTime(@RequestParam String time){
        return service.selectBySaveTime(time);
    }

    @RequestMapping("selectByDate")
    @CrossOrigin
    public List<Map<String,Object>> selectByDate(){
        return service.selectByDate();
    }

    @RequestMapping("getWeightByDate")
    @CrossOrigin
    public List<Map<String,Object>> getWeightByDate(){
        return service.getWeightByDate();
    }
}
