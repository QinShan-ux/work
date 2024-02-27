package com.example.graduationprojectspringboot.pojo;

import lombok.Data;

import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;

@Data
public class Orders {
    private int oId;
    private int uId;
    private double weight;
    private Date saveDate;
    private Time saveTime;
    private String type;
    private Boolean isTrade;
}
