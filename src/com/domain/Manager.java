package com.domain;

import java.text.NumberFormat;

public class Manager extends Employee {
    // Additional field for department name
    private String deptName;

    // Constructor with parameters
    public Manager(int employeeId, String employeeName, String employeeSSN, double employeeSalary, String deptName) {
        super(employeeId, employeeName, employeeSSN, employeeSalary);
        this.deptName = deptName;
    }

    // Getter method for department name
    public String getDeptName() {
        return deptName;
    }

    // toString method overriding the Employee's toString method
    @Override
    public String toString() {
        return super.toString() + "\nDepartment: " + getDeptName();
    }
}
