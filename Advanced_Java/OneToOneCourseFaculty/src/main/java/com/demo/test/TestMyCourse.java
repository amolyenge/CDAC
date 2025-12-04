package com.demo.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.demo.beans.Course;
import com.demo.beans.Teacher;


public class TestMyCourse {

	public static void main(String[] args) {
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		
		Teacher t1 = new Teacher("Amol");
		Course c1 = new Course(101,"Java",t1);
		t1.setCourse1(c1);
		
		Teacher t2 = new Teacher("XYZ");
		Course c2 = new Course(102,"CPP",t2);
		t2.setCourse1(c2);
		
		Teacher t3 = new Teacher("PQR");
		Course c3 = new Course(103,"MS.NET",t3);
		t3.setCourse1(c3);
		
		session.save(t1);
		session.save(c1);
		session.save(t2);
		session.save(c2);
		session.save(t3);
		session.save(c3);
		
		tr.commit();
		session.close();
		sf.close();

	}

}
