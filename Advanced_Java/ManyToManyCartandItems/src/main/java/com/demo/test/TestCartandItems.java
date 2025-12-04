package com.demo.test;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.demo.beans.Cart;
import com.demo.beans.Items;

public class TestCartandItems {

	public static void main(String[] args) {

		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		Items i1 = new Items(101, "Laptop", 2, null);
		Items i2 = new Items(102, "Mouse", 5, null);
		Items i3 = new Items(103, "Keyboard", 3, null);

		Cart c1 = new Cart(1, null);
		Cart c2 = new Cart(2, null);

		Set<Items> iset1 = new HashSet<Items>();
		iset1.add(i1);
		iset1.add(i2);
		c1.setIset(iset1);

		Set<Items> iset2 = new HashSet<Items>();
		iset2.add(i2);
		iset2.add(i3);
		c2.setIset(iset2);

		Set<Cart> cset1 = new HashSet<Cart>();
		cset1.add(c1);
		i1.setCset(cset1);

		Set<Cart> cset2 = new HashSet<Cart>();
		cset2.add(c1);
		cset2.add(c2);
		i2.setCset(cset2);

		Set<Cart> cset3 = new HashSet<Cart>();
		cset3.add(c2);
		i3.setCset(cset3);

		session.save(c1);
		session.save(c2);

		tr.commit();
		session.close();
		sf.close();
	}

}
