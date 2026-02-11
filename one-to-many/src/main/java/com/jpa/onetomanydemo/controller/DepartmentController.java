package com.jpa.onetomanydemo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jpa.onetomanydemo.dto.DepartmentDTO;
import com.jpa.onetomanydemo.entity.Department;
import com.jpa.onetomanydemo.service.DepartmentService;

@RestController
@RequestMapping("/department")
public class DepartmentController {
private DepartmentService service;
public DepartmentController(DepartmentService service) {
	this.service=service;
}

@PostMapping("/create")
public Department createDept(@RequestBody DepartmentDTO dept) {
	return service.createDepartment(dept.getDepartmentName(), dept.getEmployee().getName(),dept.getEmployee().getEmail());
}

@GetMapping
public List<Department> getAllDept(){
	 return service.getAllDepartment();
}

@GetMapping("/{id}")
public Department getDepartmentById(@PathVariable ("id")Integer id) {
	return service.getDeptById(id);
}
@DeleteMapping("/{id}")
	public String deleteDepartmentById(@PathVariable ("id") Integer id) {
		service.deleteDeptById(id);
		return "Deleted department id with id:"+id;
	}
}

