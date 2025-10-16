package com.Inheritance.beans;

public class IndividualCustomer extends Customer {
    private String phoneNumber;

    public IndividualCustomer(String custId, String name, String email, String creditClass, double discount, String plan, String phoneNumber) {
        super(custId, name, email, creditClass, discount, plan);
        this.phoneNumber = phoneNumber;
    }

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	@Override
	public String toString() {
		return "IndividualCustomer [phoneNumber=" + phoneNumber + "]";
	}

    
}
