package com.example.graduationprojectspringboot.service;

import com.example.graduationprojectspringboot.pojo.Employe;

import java.util.List;

public interface EmployeService {
    List<Employe> selectAll();
    Employe selectById(int eId);



}
