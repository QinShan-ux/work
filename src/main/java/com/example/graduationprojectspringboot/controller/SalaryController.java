package com.example.graduationprojectspringboot.controller;

import com.example.graduationprojectspringboot.service.SalaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RequestMapping("salary")
@RestController
public class SalaryController {

    @Autowired
    SalaryService service;

    @CrossOrigin
    @RequestMapping("getSalaryByDate")
    public List<Map<String,Object>> getSalaryByDate(){
        return service.getSalaryByDate();
    }
}
