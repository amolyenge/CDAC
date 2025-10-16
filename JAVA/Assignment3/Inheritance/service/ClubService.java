package com.Inheritance.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.Inheritance.beans.Employee;
import com.Inheritance.beans.Member;

public class ClubService {
    private List<Employee> employees = new ArrayList<>();
    private List<Member> members = new ArrayList<>();

    public void addEmployee(Employee e) {
        employees.add(e);
    }

    public void addMember(Member m) {
        members.add(m);
    }

    public List<Employee> getEmployeesByType(Class<?> type) {
        return employees.stream().filter(type::isInstance).collect(Collectors.toList());
    }

    public Employee searchById(int id) {
        return employees.stream().filter(e -> e.getId() == id).findFirst().orElse(null);
    }

    public List<Employee> searchByName(String name) {
        return employees.stream().filter(e -> e.getName().equalsIgnoreCase(name)).collect(Collectors.toList());
    }

    public List<Employee> getAllEmployees() {
        return employees;
    }

    public List<Employee> getEmployeesByDesignation(String designation) {
        return employees.stream().filter(e -> e.getDesignation().equalsIgnoreCase(designation)).collect(Collectors.toList());
    }

    public List<Employee> getEmployeesByDepartment(String department) {
        return employees.stream().filter(e -> e.getDepartment().equalsIgnoreCase(department)).limit(5).collect(Collectors.toList());
    }
}
