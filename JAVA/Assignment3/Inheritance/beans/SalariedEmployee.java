package com.Inheritance.beans;

public class SalariedEmployee extends Employee {
    private double basic;

    public SalariedEmployee(String name, String mobile, String email, String department, String designation, String dateOfJoining, double basic) {
        super(name, mobile, email, department, designation, dateOfJoining);
        this.basic = basic;
    }

    @Override
    public double calculateSalary() {
        double da = 0.10 * basic;
        double hra = 0.15 * basic;
        double pf = 0.12 * basic;
        return basic + da + hra - pf;
    }
}
