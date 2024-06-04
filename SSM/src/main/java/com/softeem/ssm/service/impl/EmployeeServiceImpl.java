package com.softeem.ssm.service.impl;

import com.softeem.ssm.mapper.EmployeeMapper;
import com.softeem.ssm.pojo.Employee;
import com.softeem.ssm.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeMapper employeeMapper ;

    @Override
    public List<Employee> findAll() {
        return employeeMapper.getEmployeeList();
    }
}
