package com.jpa.onetoonedemo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.jpa.onetoonedemo.entity.Employee;
import com.jpa.onetoonedemo.entity.EmployeeProfile;
import com.jpa.onetoonedemo.repo.EmployeeRepository;

import jakarta.transaction.Transactional;

@Service
public class EmployeeService{
	
	private final EmployeeRepository employeeRepository;
	
	public EmployeeService(EmployeeRepository employeeRepository) {
		this.employeeRepository=employeeRepository;	
	}
	
	public Employee createEmployeeWithProfile(String name,String email,String phone,String address) {
		Employee employee=new Employee(name,email);
		EmployeeProfile profile=new EmployeeProfile(phone,address);
		employee.setProfile(profile);
		return employeeRepository.save(employee);
}
	
public List<Employee> getAll(){
	return employeeRepository.findAll();
}

public Employee getById(Long id) {
return employeeRepository.findById(id).orElse(null);
}

@Transactional
public void deleteById(Long id) {
    Employee employee = employeeRepository.findById(id)
        .orElse(null);
//    if(employee!=null) {
//    	employeeRepository.delete(employee);
//    }

    employeeRepository.delete(employee);
}

	
//UPDATE EMPLOYEE,PROFILE
@Transactional
public Employee updateEmployeeWithProfile(Long id,String name,String email,String phone,String address) {
	Employee employee=employeeRepository.findById(id).orElse(null);
	   if (employee == null) {
           return null;
       }
//update employee fields
employee.setName(name);
employee.setEmail(email);

//update or create profile
EmployeeProfile profile=employee.getProfile();
if(profile==null) {
	profile=new EmployeeProfile();
	employee.setProfile(profile);
}
profile.setPhone(phone);
profile.setAddress(address);
return employeeRepository.save(employee);
}

	}
	
	





