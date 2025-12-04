package com.demo.beans;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Cart5")
public class Cart {

	@Id
	private int cid;
	@ManyToMany(mappedBy = "cset", cascade = CascadeType.ALL)
	Set<Items> iset;

	public Cart() {
		super();
	}

	public Cart(int cid, Set<Items> iset) {
		super();
		this.cid = cid;
		this.iset = iset;
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public Set<Items> getIset() {
		return iset;
	}

	public void setIset(Set<Items> iset) {
		this.iset = iset;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Cart [cid=").append(cid).append(", items=[");
		if (iset != null) {
			for (Items item : iset) {
				sb.append(item.getItem_id()).append(" ");
			}
		}
		sb.append("]]");
		return sb.toString();
	}

}
