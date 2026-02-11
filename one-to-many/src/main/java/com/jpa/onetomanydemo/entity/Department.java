package com.jpa.onetomanydemo.entity;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="department")
public class Department{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	@Column(nullable=false, length=50)
	private String departmentName;
	
	@OneToMany(mappedBy="department",cascade=CascadeType.ALL,orphanRemoval=true)
	@JsonManagedReference
	private List<Employee> employeeList=new ArrayList<>();

	public Department() {}
	
	public Department(String departmentName) {
		this.departmentName=departmentName;
	}
	public void addEmployee(Employee emp) {
		employeeList.add(emp);
		emp.setDepartment(this);
	}
	public void removeEmployee(Employee emp) {
		employeeList.remove(emp);
		emp.setDepartment(null);
	}
	public Integer getId() {
		return id;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName=departmentName;
	}
	public List<Employee> getEmployeeList(){
		return employeeList;
	}
}

