package com.example.graduationprojectspringboot.pojo;

import lombok.Data;

import java.sql.Date;
import java.sql.Time;

@Data
public class SucOrders {
    private int suId;
    private int uId;
    private Time payTime;
    private Date payDate;
    private float payMoney;
    private float sWeight;

}
