package com.example.graduationprojectspringboot.mapper;

import com.example.graduationprojectspringboot.pojo.SucOrders;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface SucOrdersMapper {
    List<SucOrders> selectAll();

    //根据用户id查询已支付
    SucOrders selectByUId();

    //根据订单id(主键)查询
    SucOrders selectById();

    //日期去重求每天的金额
    List<Map<String,Object>> selectByDate();
}
