package com.example.graduationprojectspringboot.mapper;

import com.example.graduationprojectspringboot.pojo.Orders;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface OrdersMapper {
    public List<Orders> selectAll();
    public List<Orders> selectByUser(int uId);

    public List<Orders> selectBySaveTime(String time);

    List<Map<String,Object>> selectByDate();

    List<Map<String,Object>> getWeightByDate();
}
