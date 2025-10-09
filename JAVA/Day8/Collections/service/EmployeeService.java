package com.Collections.service;
import java.util.List;

import com.Collections.beans.Employee;


public interface EmployeeService {

	boolean addNewEmployee();

	List<Employee> displayAll();

	Employee searchById(int eid);

	boolean deleteById(int eid);

	List<Employee> findByName(String nm);

	List<Employee> findBySalary(double sal);

	List<Employee> sortBySalary(double sal);

	boolean deleteBySalary(double sal);

	boolean updateSalary(int id, double sal);

}

