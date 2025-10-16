package com.Inheritance.beans;

import java.util.List;

public class CompanyCustomer extends Customer {
    private String relationshipManager;
    private double creditLine;
    private List<String> extensions;
    private List<String> numbers;

    public CompanyCustomer(String custId, String name, String email, String creditClass, double discount, String plan,
                           String relationshipManager, double creditLine, List<String> extensions, List<String> numbers) {
        super(custId, name, email, creditClass, discount, plan);
        this.relationshipManager = relationshipManager;
        this.creditLine = creditLine;
        this.extensions = extensions;
        this.numbers = numbers;
    }

	public String getRelationshipManager() {
		return relationshipManager;
	}

	public void setRelationshipManager(String relationshipManager) {
		this.relationshipManager = relationshipManager;
	}

	public double getCreditLine() {
		return creditLine;
	}

	public void setCreditLine(double creditLine) {
		this.creditLine = creditLine;
	}

	public List<String> getExtensions() {
		return extensions;
	}

	public void setExtensions(List<String> extensions) {
		this.extensions = extensions;
	}

	public List<String> getNumbers() {
		return numbers;
	}

	public void setNumbers(List<String> numbers) {
		this.numbers = numbers;
	}

	@Override
	public String toString() {
		return "CompanyCustomer [relationshipManager=" + relationshipManager + ", creditLine=" + creditLine
				+ ", extensions=" + extensions + ", numbers=" + numbers + "]";
	}

    
}
