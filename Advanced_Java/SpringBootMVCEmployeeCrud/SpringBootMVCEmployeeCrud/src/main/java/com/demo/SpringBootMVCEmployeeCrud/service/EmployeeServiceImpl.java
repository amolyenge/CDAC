package com.demo.SpringBootMVCEmployeeCrud.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.SpringBootMVCEmployeeCrud.beans.Employee;
import com.demo.SpringBootMVCEmployeeCrud.dao.EmployeeDao;

@Service
public class EmployeeServiceImpl implements EmployeeService{

	@Autowired
	private EmployeeDao edao;
	
	@Override
	public List<Employee> findAllEmployee() {
	   List<Employee> elist = edao.findAll();
	   return elist;
	}

	@Override
	public void addEmployee(Employee employee) {
		edao.save(employee);
		
	}

	@Override
	public Employee findByID(int eid) {
		Optional<Employee> op = edao.findById(eid);
		if(op.isPresent()) {
			return op.get();
		}
		return null;
	}

	@Override
	public void updateEmployee(Employee emp) {
		Optional<Employee> op = edao.findById(emp.getEid());
		if(op.isPresent()) {
			Employee e = op.get();
			e.setEname(emp.getDept());
			e.setSal(emp.getSal());
			e.setDept(emp.getDept());
			edao.save(e);
		}
		
	}

	@Override
	public void deleteemployee(int eid) {
		Optional<Employee> op=edao.findById(eid);
		if(op.isPresent()) {
			Employee p=op.get();
			edao.delete(p);
		}
		
	}

}
