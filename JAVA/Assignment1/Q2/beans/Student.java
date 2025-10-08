package Q2.beans;

public class Student {
   private int studid;
   private String name;
   private double m1;
   private double m2;
   private double m3;
   private double gpa;
   
public Student(int studid, String name, double m1, double m2, double m3 , double gpa) {
	super();
	this.studid = studid;
	this.name = name;
	this.m1 = m1;
	this.m2 = m2;
	this.m3 = m3;
	this.gpa = gpa;
}

public Student() {
	super();
}

public int getStudid() {
	return studid;
}

public void setStudid(int studid) {
	this.studid = studid;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public double getM1() {
	return m1;
}

public void setM1(double m1) {
	this.m1 = m1;
}

public double getM2() {
	return m2;
}

public void setM2(double m2) {
	this.m2 = m2;
}

public double getM3() {
	return m3;
}

public void setM3(double m3) {
	this.m3 = m3;
}

public void setGPA(double gpa) {
	this.gpa = gpa;
}
public double getGPA() {
	return gpa;
}

@Override
public String toString() {
	return "Student [studid=" + studid + ", name=" + name + ", m1=" + m1 + ", m2=" + m2 + ", m3=" + m3 + ", gpa=" + gpa
			+ "]";
}
   
   
}
