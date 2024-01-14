package com.psl.simple.crud;

import com.psl.simple.crud.dto.EmployeeBean;
import com.psl.simple.crud.repo.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@SpringBootApplication
public class Application {

    @Autowired
    private EmployeeRepo employeeRepo;

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }


    @PostConstruct
    public void createSomeEmployee() {

        List<EmployeeBean> employeeBeanList = Stream.of(
                new EmployeeBean(98, "Praveen"),
                new EmployeeBean(99, "Balaji"),
                new EmployeeBean(100, "Pavithra")
        ).collect(Collectors.toList());
        employeeRepo.saveAll(employeeBeanList);
    }

}
