package com.demo.beans;

import java.util.Arrays;
import java.util.Date;

public class Friend {
   private int fid;
   private String fname;
   private String lname;
   private String[] hobbies;
   private Long mobno;
   private String email;
   private Date bdate;
   private String adress;
   
public Friend() {
	super();
}
public Friend(int fid, String fname, String lname, String[] hobbies, Long mobno, String email, Date bdate,
		String adress) {
	super();
	this.fid = fid;
	this.fname = fname;
	this.lname = lname;
	this.hobbies = hobbies;
	this.mobno = mobno;
	this.email = email;
	this.bdate = bdate;
	this.adress = adress;
}
public int getFid() {
	return fid;
}
public void setFid(int fid) {
	this.fid = fid;
}
public String getFname() {
	return fname;
}
public void setFname(String fname) {
	this.fname = fname;
}
public String getLname() {
	return lname;
}
public void setLname(String lname) {
	this.lname = lname;
}
public String[] getHobbies() {
	return hobbies;
}
public void setHobbies(String[] hobbies) {
	this.hobbies = hobbies;
}
public Long getMobno() {
	return mobno;
}
public void setMobno(Long mobno) {
	this.mobno = mobno;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public Date getBdate() {
	return bdate;
}
public void setBdate(Date bdate) {
	this.bdate = bdate;
}
public String getAdress() {
	return adress;
}
public void setAdress(String adress) {
	this.adress = adress;
}
@Override
public String toString() {
	return "Friend [fid=" + fid + ", fname=" + fname + ", lname=" + lname + ", hobbies=" + Arrays.toString(hobbies)
			+ ", mobno=" + mobno + ", email=" + email + ", bdate=" + bdate + ", adress=" + adress + "]";
}
   


}
