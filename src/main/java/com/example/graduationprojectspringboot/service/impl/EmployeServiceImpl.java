package com.example.graduationprojectspringboot.service.impl;

import com.example.graduationprojectspringboot.mapper.EmployeMapper;
import com.example.graduationprojectspringboot.pojo.Employe;
import com.example.graduationprojectspringboot.service.EmployeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeServiceImpl implements EmployeService {

    @Autowired
    EmployeMapper mapper;

    @Override
    public List<Employe> selectAll() {
        return mapper.selectAll();
    }

    @Override
    public Employe selectById(int eId) {
        return mapper.selectById(eId);
    }
}
