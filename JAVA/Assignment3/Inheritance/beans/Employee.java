package com.Inheritance.beans;

public abstract class Employee {
    private static int counter = 1000;
    protected int id;
    protected String name, mobile, email, department, designation, dateOfJoining;

    public Employee(String name, String mobile, String email, String department, String designation, String dateOfJoining) {
        this.id = counter++;
        this.name = name;
        this.mobile = mobile;
        this.email = email;
        this.department = department;
        this.designation = designation;
        this.dateOfJoining = dateOfJoining;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public String getDepartment() { return department; }
    public String getDesignation() { return designation; }

    public abstract double calculateSalary();

    public String toString() {
        return String.format("ID: %d, Name: %s, Mobile: %s, Email: %s, Dept: %s, Designation: %s, DOJ: %s",
                id, name, mobile, email, department, designation, dateOfJoining);
    }
}
