package com.csa.samplefullstack.repository;

import com.csa.samplefullstack.entity.employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<employee, Long> {

}
