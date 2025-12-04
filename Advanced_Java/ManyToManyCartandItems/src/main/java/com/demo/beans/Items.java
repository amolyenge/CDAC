package com.demo.beans;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "items5")
public class Items {

	@Id
	private int item_id;
	private String item_name;
	private int qty;
	@ManyToMany()
	Set<Cart> cset;

	public Items() {
		super();
	}

	public Items(int item_id, String item_name, int qty, Set<Cart> cset) {
		super();
		this.item_id = item_id;
		this.item_name = item_name;
		this.qty = qty;
		this.cset = cset;
	}

	public int getItem_id() {
		return item_id;
	}

	public void setItem_id(int item_id) {
		this.item_id = item_id;
	}

	public String getItem_name() {
		return item_name;
	}

	public void setItem_name(String item_name) {
		this.item_name = item_name;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	public Set<Cart> getCset() {
		return cset;
	}

	public void setCset(Set<Cart> cset) {
		this.cset = cset;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Items [item_id=").append(item_id).append(", item_name=").append(item_name).append(", qty=")
				.append(qty).append(", carts=[");
		if (cset != null) {
			for (Cart cart : cset) {
				sb.append(cart.getCid()).append(" ");
			}
		}
		sb.append("]]");
		return sb.toString();
	}

}
