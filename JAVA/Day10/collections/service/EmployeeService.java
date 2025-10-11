package com.collections.service;

import java.util.List;
import java.util.Set;

import com.collections.beans.Employee;

public interface EmployeeService {

	boolean addEmployee();

	Set<Employee> findAll();

	Employee findByID(int eid);

	Set<Employee> findByName(String ename);

	boolean updateSal(int eid , double sal);

	boolean delete(int eid);

	boolean deleteBySal(double sal);

	Set<Employee> findBySalary(double sal);

	List<Employee> sortBySal();

	List<Employee> sortByName();

	Set<Employee> sortById();

}
