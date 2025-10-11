package com.collections.dao;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

import com.collections.beans.Employee;

public class EmployeeDaoImpl implements EmployeeDao {

	static Set<Employee> eset;
	static {eset = new HashSet<>();
	  eset.add( new Employee(101,"Amit",57565,LocalDate.of(2023,11,02)));
	  eset.add( new Employee(102,"Ayush",90000,LocalDate.of(2023,11,02)));
	  eset.add( new Employee(103,"Abhi",57565,LocalDate.of(2023,11,02)));
	  eset.add( new Employee(106,"Akshay",68837,LocalDate.of(2023,11,02)));
	  eset.add( new Employee(105,"Amol",50607,LocalDate.of(2024,11,02)));
	}
	
	// Add new Employee
	@Override
	public boolean save(Employee e) {
		return eset.add(e);
	}

    // Display All Employee
	@Override
	public Set<Employee> findAll() {
		return eset;
	}

    // Display by ID
	@Override
	public Employee findByID(int eid) {
		// using normal for loop
//		for(Employee e : eset) {
//			if(e.getEmpid() == eid) {
//				return e;
//			}
//		}
		
		// using stream and filter method
		Optional<Employee> ob = eset.stream().filter(e->e.getEmpid() == eid).findFirst();
		if(ob.isPresent()) {
			return ob.get();
		}
		return null;
	}

	// find by Name
	@Override
	public Set<Employee> findByName(String ename) {
		Set<Employee> es = new HashSet<>();
		// normal for loop
//		for(Employee e : eset) {
//			if(e.getEname().equals(ename)) {
//				es.add(e);
//			}
			
		// Using stream
		Set<Employee> es1 = eset.stream().filter(e->e.getEname().equals(ename)).collect(Collectors.toSet());
			if(es.size() > 0) {
				return es;
			}
		return null;
	}

	// Update sal By Id
	@Override
	public boolean update(int eid, double sal) {
		Employee e = findByID(eid);
		if(e != null) {
			e.setSal(sal);
			return true;
		}
		return false;
	}

	// Remove by id
	@Override
	public boolean remove(int eid) {
		return eset.remove(new Employee(eid));
	}

	// Remove by Salary
	@Override
	public boolean removeBySal(double sal) {
	//	return eset.removeIf(e->e.getSal()==sal); // for exact matching salary
		return eset.removeIf(e->e.getSal() > sal);
	}

	// Find by Salary
	@Override
	public Set<Employee> findBySal(double sal) {
		//Set<Employee> es = new HashSet<>();
//		for(Employee e : eset) {
//			if(e.getSal() == sal) {
//				es.add(e);
//			}
//		}
		
		// Set<Employee> ob = eset.stream().filter(e->e.getSal() == sal).collect(Collectors.toSet()); // for exact matching
		Set<Employee> es = eset.stream().filter(e->e.getSal() > sal).collect(Collectors.toSet()); // more than salary
		
		if(es.size() > 0) {
			return es;
		}
		return null;
	}

	// Sort by Salary
	@Override
	public List<Employee> sortSal() {
       Comparator<Employee> csal = (o1 , o2)->{
    	  return (int)(o1.getSal() - o2.getSal());
       };
		List<Employee> elist = new ArrayList<>();
		for(Employee e : eset) {
			elist.add(e);
		}
		elist.sort(csal);
		return elist;
	}

	// sort by Name
	@Override
	public List<Employee> sortName() {
	  Comparator<Employee> cname = (o1 , o2)->{
		  return o1.getEname().compareTo(o2.getEname());
	  };
	  List<Employee> elist = new ArrayList<>();
		for(Employee e : eset) {
			elist.add(e);
		}
		elist.sort(cname);
		return elist;
	}

  // sort by id
	@Override
	public Set<Employee> sortID() {
		Set<Employee> tset=new TreeSet<>();
		for(Employee e:eset) {
			tset.add(e);
		}
		return tset;
	}
}
