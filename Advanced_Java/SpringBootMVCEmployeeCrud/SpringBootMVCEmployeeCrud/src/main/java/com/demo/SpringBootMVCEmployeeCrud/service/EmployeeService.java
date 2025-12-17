package com.demo.SpringBootMVCEmployeeCrud.service;

import java.util.List;

import com.demo.SpringBootMVCEmployeeCrud.beans.Employee;

public interface EmployeeService {

	List<Employee> findAllEmployee();

	void addEmployee(Employee employee);

	Employee findByID(int eid);

	void updateEmployee(Employee emp);

	void deleteemployee(int eid);

}
