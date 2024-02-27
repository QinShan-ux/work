package com.example.graduationprojectspringboot.service.impl;

import com.example.graduationprojectspringboot.mapper.SucOrdersMapper;
import com.example.graduationprojectspringboot.pojo.SucOrders;
import com.example.graduationprojectspringboot.service.SucOrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class SucOrdersServiceImpl implements SucOrdersService {
    @Autowired
    SucOrdersMapper mapper;
    @Override
    public List<SucOrders> selectAll() {
        return mapper.selectAll();
    }

    @Override
    public SucOrders selectByUId(int uId) {
        return mapper.selectByUId();
    }

    @Override
    public SucOrders selectById(int id) {
        return mapper.selectById();
    }

    @Override
    public List<Map<String,Object>> selectByDate() {
        return mapper.selectByDate();
    }
}
