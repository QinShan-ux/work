package com.example.graduationprojectspringboot.mapper;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface SalaryMapper {
    List<Map<String,Object>> getSalaryByDate();

}
