package com.jpa.onetomanydemo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import com.jpa.onetomanydemo.entity.Department;

public interface DepartmentRepository
        extends JpaRepository<Department, Integer> {
}
