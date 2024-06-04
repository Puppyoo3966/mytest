package com.softeem.ssm.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Employee {
    private Integer id;
    private String name;
    private String gender;
    private Double salary;
    private Date joinDate;
    private Integer deptId;
}
