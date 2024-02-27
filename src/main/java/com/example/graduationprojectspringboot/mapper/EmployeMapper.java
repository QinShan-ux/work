package com.example.graduationprojectspringboot.mapper;

import com.example.graduationprojectspringboot.pojo.Employe;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface EmployeMapper {
    List<Employe> selectAll();
    Employe selectById(int eId);

}
