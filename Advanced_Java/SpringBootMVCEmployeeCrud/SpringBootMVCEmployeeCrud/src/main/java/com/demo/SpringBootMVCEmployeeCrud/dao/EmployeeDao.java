package com.demo.SpringBootMVCEmployeeCrud.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.SpringBootMVCEmployeeCrud.beans.Employee;

@Repository
public interface EmployeeDao extends JpaRepository<Employee,Integer>{
   
}
