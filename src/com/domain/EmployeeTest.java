package com.domain;

import com.example.business.EmployeeStockPlan;

public class EmployeeTest {

    // Original printEmployee method
    public static void printEmployee(Employee emp) {
        System.out.println("Employee type: " + emp.getClass().getSimpleName());
        System.out.println(emp);
    }

    // Overloaded printEmployee method with EmployeeStockPlan parameter
    public static void printEmployee(Employee emp, EmployeeStockPlan esp) {
        printEmployee(emp); // Call the original printEmployee method
        System.out.println("Stock Options: " + esp.grantStock(emp));
    }

    public static void main(String[] args) {
        // Create instances of Employee, Manager, Admin, and Director
        Employee emp = new Employee(101, "Jane Smith", "012-34-5678", 120345.27);
        Manager manager = new Manager(207, "Barbara Johnson", "054-12-2367", 109501.36, "US Marketing");
        Admin admin = new Admin(304, "Bill Monroe", "108-23-6509", 75002.34);
        Director director = new Director(111, "Susan Wheeler", "099-45-2340", 120567.36, "Global Marketing", 1000000.00);

        // Create an instance of EmployeeStockPlan
        EmployeeStockPlan esp = new EmployeeStockPlan();

        // Print information using the printEmployee methods with EmployeeStockPlan instance
        printEmployee(emp, esp);
        System.out.println();
        printEmployee(manager, esp);
        System.out.println();
        printEmployee(admin, esp);
        System.out.println();
        printEmployee(director, esp);
        System.out.println();
    }
}
