package com.example.graduationprojectspringboot.pojo;

import lombok.Data;

import java.sql.Time;
import java.util.List;

@Data
public class Employe {
    private int eId;
    private String eName;
    private String ePhone;
    private String eAddress;
    private String post;
    List<Salary> list;
}
