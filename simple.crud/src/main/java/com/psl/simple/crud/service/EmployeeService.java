package com.psl.simple.crud.service;

import com.psl.simple.crud.dto.EmployeeBean;

public interface EmployeeService {

    Object getAllEmployeeFromDB();

    Object saveAnEmployeeObject(EmployeeBean employeeBean);

    Object retrieveAnEmployee(Integer employeeId);
}
