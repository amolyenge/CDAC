package com.demo.StudentRestDemo.dto;

import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;

public class StudentDto {
	private int sid;
	private String sname;
	private int m1;
	private int m2;
	private String dob;
	
	public StudentDto() {
		super();
	}

	public StudentDto(int sid, String sname, int m1, int m2, String dob) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.m1 = m1;
		this.m2 = m2;
		this.dob = dob;
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public int getM1() {
		return m1;
	}

	public void setM1(int m1) {
		this.m1 = m1;
	}

	public int getM2() {
		return m2;
	}

	public void setM2(int m2) {
		this.m2 = m2;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	@Override
	public String toString() {
		return "StudentDto [sid=" + sid + ", sname=" + sname + ", m1=" + m1 + ", m2=" + m2 + ", dob=" + dob + "]";
	}
	
	
}
