package com.example.graduationprojectspringboot.controller;

import com.example.graduationprojectspringboot.pojo.Employe;
import com.example.graduationprojectspringboot.pojo.Orders;
import com.example.graduationprojectspringboot.service.EmployeService;
import com.example.graduationprojectspringboot.service.OrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("employe")
public class EmployeController {

    @Autowired
    EmployeService service;

    @CrossOrigin
    @RequestMapping("selectAll")
    public List<Employe> selectAll(){
        return service.selectAll();
    }
}
