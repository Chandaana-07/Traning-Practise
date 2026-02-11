package com.jpa.onetoonedemo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jpa.onetoonedemo.dto.EmployeeCreateRequest;
import com.jpa.onetoonedemo.entity.Employee;
import com.jpa.onetoonedemo.service.EmployeeService;
@RestController
@RequestMapping("/employees")
public class EmployeeController {
private final EmployeeService employeeService;
public EmployeeController(EmployeeService employeeService) {
	this.employeeService=employeeService;
}
//create
@PostMapping("/create")
public Employee create(@RequestBody EmployeeCreateRequest req) {
	return employeeService.createEmployeeWithProfile(req.getName(),req.getEmail(),req.getProfile().getPhone(),req.getProfile().getAddress());
}

@GetMapping
public List <Employee> all(){
	return employeeService.getAll();
}

@GetMapping("/{id}")
public Employee getById(@PathVariable("id") Long id) {
return employeeService.getById(id);
}
@DeleteMapping("/{id}")
public String delete(@PathVariable("id") Long id) {
	employeeService.deleteById(id);
	return "Deleted employee id = "+id;
}
@PutMapping("/{id}")
public Employee update(@PathVariable("id") Long id,@RequestBody EmployeeCreateRequest req) {
	return employeeService.updateEmployeeWithProfile(id, req.getName(),req.getEmail(),req.getProfile().getPhone(),req.getProfile().getAddress());
}
}




