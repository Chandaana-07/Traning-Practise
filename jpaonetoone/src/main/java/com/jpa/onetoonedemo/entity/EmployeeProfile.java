package com.jpa.onetoonedemo.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="EmployeeProfile")
public class EmployeeProfile {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
private Long id;

@Column(name="phone",nullable=false,unique=true)
private String phone;

@Column(name="address",unique=true)
private String address;

@OneToOne
@JoinColumn(name="emp_id",nullable=false,unique=true)
@JsonIgnore

private Employee employee;

public EmployeeProfile () {}

public EmployeeProfile(String phone,String address) {
	this.phone=phone;
	this.address=address;
	}
public Long getId() {
	return id;
}
public void setPhone(String phone) {
	this.phone=phone;
}
public String getPhone() {
	return phone;
}
public void setAddress(String address) {
	this.address=address;
}
public String getAddres() {
	return address;
}
public void setEmployee(Employee employee) {
this.employee=employee;
}
}
