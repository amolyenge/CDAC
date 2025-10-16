package com.Inheritance.beans;

public class Vendor extends Employee {
    private int numEmployees;
    private double amount;

    public Vendor(String name, String mobile, String email, String department, String designation, String dateOfJoining, int numEmployees, double amount) {
        super(name, mobile, email, department, designation, dateOfJoining);
        this.numEmployees = numEmployees;
        this.amount = amount;
    }

    @Override
    public double calculateSalary() {
        return amount + (0.18 * amount);
    }
}
