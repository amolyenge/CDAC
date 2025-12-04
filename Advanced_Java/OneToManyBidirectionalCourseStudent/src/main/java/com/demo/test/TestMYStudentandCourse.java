package com.demo.test;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.demo.beans.Course;
import com.demo.beans.Student;

public class TestMYStudentandCourse {

	public static void main(String[] args) {
		
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		
		Course c1 = new Course(101,"PG-DAC");
		Course c2 = new Course(102,"PG-DBDA");
		Course c3 = new Course(103,"PG-DAI");
		
		Student s1 = new Student(1,"Abhishek Alkari",c1);
		Student s2 = new Student(2,"Naksh Alkari",c1);
		Student s3 = new Student(3,"Jay Adhav",c1);
		Student s4 = new Student(4,"Akshay Jaiswal",c2);
		Student s5 = new Student(5,"Anuj Wagh",c2);
		Student s6 = new Student(6,"Manish Nagrale",c3);
		Student s7 = new Student(7,"Mayur Kachane",c3);
		
		Set<Student> set1=new HashSet<Student>();
		set1.add(s1);
		set1.add(s2);
		set1.add(s3);
		
		Set<Student> set2=new HashSet<Student>();
		set1.add(s4);
		set1.add(s5);
		
		Set<Student> set3=new HashSet<Student>();
		set1.add(s6);
		set1.add(s7);
		
		c1.setStudents(set1);
		c2.setStudents(set2);
		c3.setStudents(set3);
		
		session.save(c1);
		session.save(c2);
		session.save(c3);
		session.save(s1);
		session.save(s2);
		session.save(s3);
		session.save(s4);
		session.save(s5);
		session.save(s6);
		session.save(s7);
		
		tr.commit();
		session.close();
		sf.close();
	}
}
