package com.example.graduationprojectspringboot.service.impl;

import com.example.graduationprojectspringboot.mapper.SalaryMapper;
import com.example.graduationprojectspringboot.service.SalaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class SalaryServiceImpl implements SalaryService {
    @Autowired
    SalaryMapper mapper;
    @Override
    public List<Map<String,Object>> getSalaryByDate() {
        return mapper.getSalaryByDate();
    }
}
