package com.example.graduationprojectspringboot.service;

import com.example.graduationprojectspringboot.pojo.Users;

import java.util.List;

public interface UserService {
    Users selectById(int id);

    List<Users> selectAll();
}
