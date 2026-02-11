package com.jpa.onetoonedemo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jpa.onetoonedemo.entity.Employee;

public interface EmployeeRepository extends JpaRepository <Employee,Long>{

}
