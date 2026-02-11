package com.jpa.onetomanydemo.dto;

public class DepartmentDTO {
	private String departmentName;

    private EmployeeDTO employee;

    public static class EmployeeDTO{
        private String name;
        private String email;

        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }

        public String getEmail() {
            return email;
        }
        public void setEmail(String email) {
            this.email = email;
        }
    }

    public String getDepartmentName() {
        return departmentName;
    }
    public void setDeptName(String departmentName) {
        this.departmentName = departmentName;
    }

    public EmployeeDTO getEmployee() {
        return employee;
    }
    public void setEmployee(EmployeeDTO employee) {
        this.employee = employee;
    }
}

