package com.softeem.ssm.mapper;

import com.softeem.ssm.pojo.Employee;
import org.springframework.stereotype.Repository;

import java.util.List;


public interface EmployeeMapper {
    List<Employee> getEmployeeList();
}