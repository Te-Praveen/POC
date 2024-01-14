package com.psl.simple.crud.controller;

import com.psl.simple.crud.dto.EmployeeBean;
import com.psl.simple.crud.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/")
    public Object getAllEmployeeFromDB() {
        return employeeService.getAllEmployeeFromDB();
    }

    @GetMapping("/save-an-employee")
    public Object saveAnEmployee(@RequestParam(name = "employeeName") String name, @RequestParam(name = "employeeId") Integer employeeId) {
        return new ResponseEntity<>(employeeService.saveAnEmployeeObject(new EmployeeBean(employeeId, name)), HttpStatus.ACCEPTED);
    }

    @GetMapping("/retrieve-an-employee")
    public Object retrieveAnEmployee(@RequestParam(name = "employeeId") Integer employeeId) {
        return new ResponseEntity<>(employeeService.retrieveAnEmployee(employeeId), HttpStatus.ACCEPTED);
    }
}
