package com.demo.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.demo.beans.Cart;
import com.demo.beans.Items;

public class TestGetData {

	public static void main(String[] args) {
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();

		Cart c1 = session.get(Cart.class, 1);
		System.out.println("Cart ID: " + c1.getCid());
		System.out.println("Items in Cart:");
		for (Items item : c1.getIset()) {
			System.out.println(
					"   Item ID: " + item.getItem_id() + ", Name: " + item.getItem_name() + ", Qty: " + item.getQty());
		}

		Items i1 = session.get(Items.class, 101);

		System.out.println("Item ID: " + i1.getItem_id() + ", Name: " + i1.getItem_name() + ", Qty: " + i1.getQty());
		System.out.println("Carts containing this item:");
		System.out.println(i1.getCset());

		tr.commit();
		session.close();
		sf.close();

	}

}
