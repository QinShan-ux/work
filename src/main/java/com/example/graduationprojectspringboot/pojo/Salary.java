package com.example.graduationprojectspringboot.pojo;

import lombok.Data;

import java.sql.Time;

@Data
public class Salary {
    private int sId;
    private int eId;
    private double money;
    private Time salaryTime;

}
