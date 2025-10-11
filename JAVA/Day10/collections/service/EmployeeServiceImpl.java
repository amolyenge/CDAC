package com.collections.service;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

import com.collections.beans.Employee;
import com.collections.dao.EmployeeDao;
import com.collections.dao.EmployeeDaoImpl;

public class EmployeeServiceImpl implements EmployeeService {
	   private EmployeeDao edao;

	   public EmployeeServiceImpl() {
	   	super();
	   	this.edao = new EmployeeDaoImpl();
	   }
	
	   // add new Employee
	@Override
	public boolean addEmployee() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Employee Id : \n");
		int eid = sc.nextInt();
		System.out.println("Enter Employee Name : \n");
		String nm = sc.next();
		System.out.println("Enter Employee Salary : \n");
		double sal = sc.nextDouble();
		System.out.println("Enter Date of Joining (dd/mm/yyyy) : \n");
		String dt = sc.next();
		LocalDate edt = LocalDate.parse(dt , DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		Employee e = new Employee(eid , nm , sal , edt);
		
		return edao.save(e);
	}

	// find all Employees
	@Override
	public Set<Employee> findAll() {
		return edao.findAll();
	}

	// find Employee by id
	@Override
	public Employee findByID(int eid) {
		return edao.findByID(eid);
	}

	// find by Name
	@Override
	public Set<Employee> findByName(String ename) {
		return edao.findByName(ename);
	}

	// Update Salary
	@Override
	public boolean updateSal(int eid , double sal) {
		return edao.update(eid , sal);
	}

	// Delete by Id
	@Override
	public boolean delete(int eid) {
		return edao.remove(eid);
	}

	// delete by Salary
	@Override
	public boolean deleteBySal(double sal) {
		return edao.removeBySal(sal);
	}

	// find by Salary
	@Override
	public Set<Employee> findBySalary(double sal) {
		return edao.findBySal(sal);
	}

	// sort by Salary
	@Override
	public List<Employee> sortBySal() {
		
		return edao.sortSal();
	}

	//sort by Name
	@Override
	public List<Employee> sortByName() {
		return edao.sortName();
	}

	// sort by id
	@Override
	public Set<Employee> sortById() {
		return edao.sortID();
	}

}
