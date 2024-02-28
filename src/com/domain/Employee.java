package com.domain;

import java.text.NumberFormat;

public class Employee {
    // Data fields
    private int employeeId;
    private String employeeName;
    private String employeeSSN;
    private double employeeSalary;

    // Constructor with parameters
    public Employee(int employeeId, String employeeName, String employeeSSN, double employeeSalary) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.employeeSSN = employeeSSN;
        this.employeeSalary = employeeSalary;
    }

    // Accessor methods
    public int getEmployeeId() {
        return employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public String getEmployeeSSN() {
        return employeeSSN;
    }

    public double getEmployeeSalary() {
        return employeeSalary;
    }

    // toString method
    @Override
    public String toString() {
        return "Employee ID: " + getEmployeeId() + "\n" +
                "Employee Name: " + getEmployeeName() + "\n" +
                "Employee SSN: " + getEmployeeSSN() + "\n" +
                "Employee Salary: " + NumberFormat.getCurrencyInstance().format(getEmployeeSalary());
    }
}
