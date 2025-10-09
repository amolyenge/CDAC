package com.Collections.beans;

import java.time.LocalDate;

public class Employee {
   private int empid;
   private String ename;
   private double sal;
   private LocalDate jdt;
   
   public Employee() {
	   super();
   }

   // written extra constructor for only employee id as we need it 
	public Employee(int empid) {
	  super();
	  this.empid = empid;
    }
	
	// // same but for sal
	public Employee(double sal) {
	  super();
	  this.sal = sal;
    }

	public Employee(int empid, String ename, double sal, LocalDate jdt) {
		super();
		this.empid = empid;
		this.ename = ename;
		this.sal = sal;
		this.jdt = jdt;
	}
	
	
	// Overridden equals methods of object so we can reuse again and again
	@Override
	public boolean equals(Object obj) {
		System.out.println("in equals method "+this.empid+"----"+((Employee)obj).empid);
		return this.empid==((Employee)obj).empid;
	}

	public int getEmpid() {
		return empid;
	}
	
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	
	public String getEname() {
		return ename;
	}
	
	public void setEname(String ename) {
		this.ename = ename;
	}
	
	public double getSal() {
		return sal;
	}
	
	public void setSal(double sal) {
		this.sal = sal;
	}
	
	public LocalDate getJdt() {
		return jdt;
	}
	
	public void setJdt(LocalDate jdt) {
		this.jdt = jdt;
	}
	
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", ename=" + ename + ", sal=" + sal + ", jdt=" + jdt + "]";
	}
   
}
