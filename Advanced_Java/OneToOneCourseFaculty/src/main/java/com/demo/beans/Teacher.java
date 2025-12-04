package com.demo.beans;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Teacher {

	@Id
	@GeneratedValue
	private int tid;
	private String tname;
	@OneToOne(mappedBy="teacher",fetch=FetchType.LAZY)
	private Course course1;
	
	public Teacher(int tid, String tname, Course course1) {
		super();
		this.tid = tid;
		this.tname = tname;
		this.course1 = course1;
	}

	public Teacher() {
		super();
	}
	
	public Teacher(String tname) {
		this.tname = tname;
	}

	public int getTid() {
		return tid;
	}

	public void setTid(int tid) {
		this.tid = tid;
	}

	public String getTname() {
		return tname;
	}

	public void setTname(String tname) {
		this.tname = tname;
	}

	public Course getCourse1() {
		return course1;
	}

	public void setCourse1(Course course1) {
		this.course1 = course1;
	}

	@Override
	public String toString() {
	    return "Teacher [tid=" + tid + ", tname=" + tname + "]";
	}

	
}
