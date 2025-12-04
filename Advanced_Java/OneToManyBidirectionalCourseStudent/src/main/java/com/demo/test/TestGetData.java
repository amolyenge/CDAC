package com.demo.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.demo.beans.Course;
import com.demo.beans.Student;

public class TestGetData {

	public static void main(String[] args) {
		
		SessionFactory sf=new Configuration().configure().buildSessionFactory();
		Session session=sf.getCurrentSession();
		Transaction tr=session.beginTransaction();
		Course c1 = session.get(Course.class ,101);
		System.out.println(c1);
		System.out.println(c1.getStudents());
		Student s1 = session.get(Student.class,1);
		System.out.println(s1);
		
		Course c2 = session.get(Course.class ,102);
		System.out.println(c2);
		System.out.println(c2.getStudents());
		Student s2 = session.get(Student.class,2);
		System.out.println(s2);
		
		Course c3 = session.get(Course.class ,103);
		System.out.println(c3);
		System.out.println(c3.getStudents());
		Student s3 = session.get(Student.class,3);
		System.out.println(s3);
		
		tr.commit();
		session.close();
		sf.close();

	}

}
