package com.example.graduationprojectspringboot.service.impl;

import com.example.graduationprojectspringboot.mapper.UserMapper;
import com.example.graduationprojectspringboot.pojo.Users;
import com.example.graduationprojectspringboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper mapper;
    @Override
    public Users selectById(int id) {
        return mapper.selectById(id);
    }

    @Override
    public List<Users> selectAll() {
        return mapper.selectAll();
    }
}
