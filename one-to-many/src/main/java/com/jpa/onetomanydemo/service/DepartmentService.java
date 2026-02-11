package com.jpa.onetomanydemo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.jpa.onetomanydemo.entity.Department;
import com.jpa.onetomanydemo.entity.Employee;
import com.jpa.onetomanydemo.repo.DepartmentRepository;

import jakarta.transaction.Transactional;

@Service
public class DepartmentService {

    private DepartmentRepository repo;

    public DepartmentService(DepartmentRepository repo) {
        this.repo = repo;
    }

    public Department createDepartment(String departmentName, String name, String email) {

        Department department = new Department(departmentName);
        Employee emp = new Employee(name, email);

        department.addEmployee(emp); // bidirectional mapping
        return repo.save(department); // cascade saves employee
    }

    public List<Department> getAllDepartment() {
        return repo.findAll();
    }

    @Transactional
    public Department getDeptById(Integer id) {
        return repo.findById(id)
                   .orElseThrow(() -> new RuntimeException("Department not found"));
    }

    public void deleteDeptById(Integer id) {
        repo.deleteById(id);
    }
}
