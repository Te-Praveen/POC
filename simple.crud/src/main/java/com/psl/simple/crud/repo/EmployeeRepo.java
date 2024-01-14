package com.psl.simple.crud.repo;

import com.psl.simple.crud.dto.EmployeeBean;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepo extends JpaRepository<EmployeeBean, Integer> {


}
