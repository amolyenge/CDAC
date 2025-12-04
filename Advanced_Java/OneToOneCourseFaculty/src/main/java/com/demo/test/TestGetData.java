package com.demo.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.demo.beans.Course;
import com.demo.beans.Teacher;

public class TestGetData {

	public static void main(String[] args) {
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		
		Course c1 = session.get(Course.class , 101);
		Teacher t1 = session.get(Teacher.class , 11);
		
		Course c2 = session.get(Course.class , 102);
		Teacher t2 = session.get(Teacher.class , 12);
		
         tr.commit();
         System.out.println(c1);
         System.out.println(c2);

	}

}
