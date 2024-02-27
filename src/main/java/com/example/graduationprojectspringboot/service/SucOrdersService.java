package com.example.graduationprojectspringboot.service;

import com.example.graduationprojectspringboot.pojo.SucOrders;

import java.util.List;
import java.util.Map;

public interface SucOrdersService {
    List<SucOrders> selectAll();

    //根据用户id查询已支付
    SucOrders selectByUId(int uId);

    //根据订单id(主键)查询
    SucOrders selectById(int id);

    //日期去重求每天的金额
    List<Map<String,Object>> selectByDate();
}
