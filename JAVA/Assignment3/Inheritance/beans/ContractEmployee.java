package com.Inheritance.beans;

public class ContractEmployee extends Employee {
    private int hoursWorked;
    private double ratePerHour;

    public ContractEmployee(String name, String mobile, String email, String department, String designation, String dateOfJoining, int hoursWorked, double ratePerHour) {
        super(name, mobile, email, department, designation, dateOfJoining);
        this.hoursWorked = hoursWorked;
        this.ratePerHour = ratePerHour;
    }

    @Override
    public double calculateSalary() {
        return hoursWorked * ratePerHour;
    }
}
