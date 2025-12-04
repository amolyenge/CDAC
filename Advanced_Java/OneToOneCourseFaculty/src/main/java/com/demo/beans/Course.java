package com.demo.beans;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Course {
	
  @Id
  private int cid;
  private String cname;
  @OneToOne(fetch=FetchType.LAZY)
  @JoinColumn(name="tid")
  private Teacher teacher;
  
  
public Course() {
	super();
}
public Course(int cid, String cname, Teacher teacher) {
	super();
	this.cid = cid;
	this.cname = cname;
	this.teacher = teacher;
}
public int getCid() {
	return cid;
}
public void setCid(int cid) {
	this.cid = cid;
}
public String getCname() {
	return cname;
}
public void setCname(String cname) {
	this.cname = cname;
}
public Teacher getTeacher() {
	return teacher;
}
public void setTeacher(Teacher teacher) {
	this.teacher = teacher;
}
@Override
public String toString() {
    return "Course [cid=" + cid + ", cname=" + cname + 
           ", teacher=" + (teacher != null ? teacher.getTname() : "null") + "]";
}

  
  
}
