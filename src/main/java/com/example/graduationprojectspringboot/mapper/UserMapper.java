package com.example.graduationprojectspringboot.mapper;

import com.example.graduationprojectspringboot.pojo.Users;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {
    //根据id查询
    Users selectById(int id);

    //查询所有用户
    List<Users> selectAll();
}
