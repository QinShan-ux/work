package com.example.graduationprojectspringboot.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Users {
    private int uId;
    private String uName;
    private String uPhone;
    private String uAddress;

}
