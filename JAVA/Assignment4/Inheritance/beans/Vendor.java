package com.Inheritance.beans;

import java.util.List;

public class Vendor extends Entity {
    private String vendorId;
    private String phoneNumber;
    private List<String> products;

    public Vendor(String vendorId, String name, String email, String phoneNumber, List<String> products) {
        super(name, email);
        this.vendorId = vendorId;
        this.phoneNumber = phoneNumber;
        this.products = products;
    }

	public String getVendorId() {
		return vendorId;
	}

	public void setVendorId(String vendorId) {
		this.vendorId = vendorId;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public List<String> getProducts() {
		return products;
	}

	public void setProducts(List<String> products) {
		this.products = products;
	}

	@Override
	public String toString() {
		return "Vendor [vendorId=" + vendorId + ", phoneNumber=" + phoneNumber + ", products=" + products + "]";
	}

    
}
