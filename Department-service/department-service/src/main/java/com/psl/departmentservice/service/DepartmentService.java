package com.psl.departmentservice.service;

import com.psl.departmentservice.controller.DepartmentController;
import com.psl.departmentservice.entities.Department;
import com.psl.departmentservice.repo.DepartmentRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepartmentService {
    private static final Logger LOGGER = LoggerFactory.getLogger(DepartmentController.class);
    @Autowired
    private DepartmentRepository repository;


    public Department saveDepartment(Department department) {
        LOGGER.info(String.format("Request Received at Service %s", department));
        return repository.save(department);
    }

    public Department findByDepartmentId(Long departmentId) {
        LOGGER.info("Request Received at Service -", departmentId);
        return repository.findByDepartmentId(departmentId);
    }
}
