package com.example.graduationprojectspringboot.service;

import com.example.graduationprojectspringboot.pojo.Orders;

import java.util.List;
import java.util.Map;

public interface OrdersService {
    public List<Orders> selectAll();
    public List<Orders> selectByUser(int uId);

    public List<Orders> selectBySaveTime(String time);
    List<Map<String,Object>> selectByDate();

    //获取每一天的重量
    List<Map<String,Object>> getWeightByDate();

}
