package com.jpa.onetomanydemo.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="employee")
public class Employee{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	@Column(nullable=false,length=50)
	private String name;
	
	@Column(nullable=false,length=50)
	private String email;
	
	@ManyToOne
	@JoinColumn(name="department_id")
	@JsonBackReference
	private Department department;
	
	public Employee() {}
	
	public Employee(String name,String email) {
		this.name=name;
		this.email=email;
	}
	
	public Integer getId() {
		return id;
	}
	
	public void setName(String name) {
		this.name=name;
		
	}
	
	public String getName() {
		return name;
	}
	
	public void setEmail(String email) {
		this.email=email;
	}
	
	public String getEmail() {
		return email;
	}
	
	public Department getDepartment() {
		return department;
	}
	
	public void  setDepartment(Department department) {
		this.department=department;
	}
	
}
