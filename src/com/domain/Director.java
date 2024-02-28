package com.domain;

import java.text.NumberFormat;

public class Director extends Manager {
    // Additional field for budget
    private double budget;

    // Constructor with parameters
    public Director(int employeeId, String employeeName, String employeeSSN, double employeeSalary, String deptName, double budget) {
        super(employeeId, employeeName, employeeSSN, employeeSalary, deptName);
        this.budget = budget;
    }

    // Getter method for budget
    public double getBudget() {
        return budget;
    }

    // toString method overriding the Manager's toString method
    @Override
    public String toString() {
        return super.toString() + "\nBudget: " + NumberFormat.getCurrencyInstance().format(budget);
    }
}
