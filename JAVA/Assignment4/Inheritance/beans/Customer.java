package com.Inheritance.beans;

public abstract class Customer extends Entity {
    protected String custId;
    protected String creditClass;
    protected double discount;
    protected String plan;

    public Customer(String custId, String name, String email, String creditClass, double discount, String plan) {
        super(name, email);
        this.custId = custId;
        this.creditClass = creditClass;
        this.discount = discount;
        this.plan = plan;
    }

	public String getCustId() {
		return custId;
	}

	public void setCustId(String custId) {
		this.custId = custId;
	}

	public String getCreditClass() {
		return creditClass;
	}

	public void setCreditClass(String creditClass) {
		this.creditClass = creditClass;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}

	public String getPlan() {
		return plan;
	}

	public void setPlan(String plan) {
		this.plan = plan;
	}

	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Customer(String name, String email) {
		super(name, email);
	}

	@Override
	public String toString() {
		return "Customer [custId=" + custId + ", creditClass=" + creditClass + ", discount=" + discount + ", plan="
				+ plan + "]";
	}

    
}
