package com.example.graduationprojectspringboot.service;

import com.example.graduationprojectspringboot.pojo.Orders;

import java.util.List;
import java.util.Map;

public interface SalaryService {
    List<Map<String,Object>> getSalaryByDate();

}
