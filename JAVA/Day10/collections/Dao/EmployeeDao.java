package com.collections.dao;

import java.util.List;
import java.util.Set;

import com.collections.beans.Employee;

public interface EmployeeDao {

	boolean save(Employee e);

	Set<Employee> findAll();

	Employee findByID(int eid);

	Set<Employee> findByName(String ename);

	boolean update(int eid, double sal);

	boolean remove(int eid);

	boolean removeBySal(double sal);

	Set<Employee> findBySal(double sal);

	List<Employee> sortSal();

	List<Employee> sortName();

	Set<Employee> sortID();

}
