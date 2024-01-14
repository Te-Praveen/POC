package com.psl.simple.crud.service.impl;

import com.psl.simple.crud.dto.EmployeeBean;
import com.psl.simple.crud.repo.EmployeeRepo;
import com.psl.simple.crud.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepo employeeRepo;

    @Override
    public Object getAllEmployeeFromDB() {
        return employeeRepo.findAll();
    }


    @Override
    public Object saveAnEmployeeObject(EmployeeBean employeeBean) {
        return employeeRepo.save(employeeBean);
    }


    @Override
    public Object retrieveAnEmployee(Integer employeeId) {
        return employeeRepo.findById(employeeId);
    }
}
