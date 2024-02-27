package com.example.graduationprojectspringboot.service.impl;

import com.example.graduationprojectspringboot.mapper.OrdersMapper;
import com.example.graduationprojectspringboot.pojo.Orders;
import com.example.graduationprojectspringboot.service.OrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class OrdersServiceImpl implements OrdersService {

    @Autowired
    OrdersMapper mapper;
    @Override
    public List<Orders> selectAll() {
        return mapper.selectAll();
    }

    @Override
    public List<Orders> selectByUser(int uId) {
        return mapper.selectByUser(uId);
    }

    @Override
    public List<Orders> selectBySaveTime(String time) {
        return mapper.selectBySaveTime(time);
    }

    @Override
    public List<Map<String, Object>> selectByDate() {
        return mapper.selectByDate();
    }

    @Override
    public List<Map<String,Object>> getWeightByDate() {
        return mapper.getWeightByDate();
    }

}
