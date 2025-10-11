package com.collections.test;

import java.util.List;
import java.util.Scanner;
import java.util.Set;

import com.collections.beans.Employee;
import com.collections.service.EmployeeService;
import com.collections.service.EmployeeServiceImpl;

public class TestEmployeeSetDetails {
  public static void main(String[] args) {
	  Scanner sc = new Scanner(System.in);
	  EmployeeService eservice=new EmployeeServiceImpl();;
	  int choice = 0;
	  do {
		  System.out.println("1. add new employee\n 2. display all\n3. search by id");
		  System.out.println("4. Search by name\n 5. update sal\n6. delete by id\n7. delete by salary\n");
		  System.out.println("8. search by salary \n 9. sort by salary\n10. Sort By name\n 11. Sort By id\n12. exit\n choice: ");
		  choice = sc.nextInt();
		  
		 switch(choice) {
		    case 1->{
			  boolean status = eservice.addEmployee();
			  if(status) {
				  System.out.println("Employee added successfully. \n");
			  }else {
				  System.out.println("Duplicate id , not added..");
			  }
		    }
		    
		    case 2->{
		    	Set<Employee> eset = eservice.findAll();
		    	eset.forEach(System.out::println);
		    }
		    
		    case 3->{
		        System.out.println("Enter Employee Id : \n");
		        int eid = sc.nextInt();
		        Employee e = eservice.findByID(eid);
		        if(e != null) {
		        	System.out.println(e);
		        }else {
		        	System.out.println("Employee not Found..");
		        }
		    }
		    
		    case 4->{
		        System.out.println("Enter Employee Name : \n");
		        String ename = sc.next();
		        Set<Employee> e = eservice.findByName(ename);
		        if(e != null) {
		        	e.forEach(System.out::println);
		        }else {
		        	System.out.println("Employee not Found..");
		        }
		    }
		    
		    case 5->{
		        System.out.println("Enter Employee ID : \n");
		        int eid = sc.nextInt();
		        System.out.println("Enter Employee Salary : \n");
		        double sal = sc.nextDouble();
		        boolean status = eservice.updateSal(eid , sal);
		        if(status) {
		        	System.out.println("Employee Salary Updated Syccessfully..");
		        }else {
		        	System.out.println("Employee not Found , Salary not Updated");
		        }
		    }
		    
		    case 6->{
		        System.out.println("Enter Employee ID : \n");
		        int eid = sc.nextInt();
		        boolean status = eservice.delete(eid);
		        if(status) {
		        	System.out.println("Employee Deleted Syccessfully..");
		        }else {
		        	System.out.println("Employee not Found.");
		        }
		    }
		    
		    case 7->{
		        System.out.println("Enter Employee Salary : \n");
		        double sal = sc.nextDouble();
		        boolean status = eservice.deleteBySal(sal);
		        if(status) {
		        	System.out.println("Employee Deleted Syccessfully..");
		        }else {
		        	System.out.println("Employee not Found.");
		        }
		    }
		    
		    case 8->{
		        System.out.println("Enter Employee Salary : \n");
		        double sal = sc.nextDouble();
		        Set<Employee> e = eservice.findBySalary(sal);
		        if(e != null) {
		        	e.forEach(System.out::println);
		        }else {
		        	System.out.println("Employee not Found..");
		        }
		    }
		    
		    case 9->{
				List<Employee> elist=eservice.sortBySal();
				elist.forEach(System.out::println);
		    }
		    
		    case 10->{
				List<Employee> elist=eservice.sortByName();
				elist.forEach(System.out::println);
		    }
		    
		    case 11->{
				Set<Employee> elist=eservice.sortById();
				elist.forEach(System.out::println);
		    }
		    case 12->{
				sc.close();
				System.out.println("Thank You for Visiting..");
		    }
		    
		    default ->{
				System.out.println("Wrong choice !");
		    }
		    
		  }
	  }while(choice != 12);
	  
  }
}
