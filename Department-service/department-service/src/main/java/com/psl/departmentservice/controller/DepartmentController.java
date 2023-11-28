package com.psl.departmentservice.controller;

import com.psl.departmentservice.entities.Department;
import com.psl.departmentservice.service.DepartmentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/departments")
public class DepartmentController {

    private static final Logger LOGGER = LoggerFactory.getLogger(DepartmentController.class);

    @Autowired
    private DepartmentService departmentService;

    @PostMapping("/")
    public Department saveDepartment(@RequestBody Department department) {
        LOGGER.info(String.format("Request Received at Controller %s", department));
        return departmentService.saveDepartment(department);
    }

    @GetMapping("/{id}")
    public Department findByDepartmentId(@PathVariable("id") Long departmentId){
        LOGGER.info("Request Received at Controller - ", departmentId);
        return departmentService.findByDepartmentId(departmentId);
    }

}
