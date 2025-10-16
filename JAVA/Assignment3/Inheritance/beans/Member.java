package com.Inheritance.beans;

public class Member {
    private static int memberCounter = 5000;
    private int id;
    private String name, mobile, email, membershipType;
    private double amountPaid;

    public Member(String name, String mobile, String email, String membershipType, double amountPaid) {
        this.id = memberCounter++;
        this.name = name;
        this.mobile = mobile;
        this.email = email;
        this.membershipType = membershipType;
        this.amountPaid = amountPaid;
    }

    public String toString() {
        return String.format("Member ID: %d, Name: %s, Mobile: %s, Email: %s, Type: %s, Paid: %.2f",
                id, name, mobile, email, membershipType, amountPaid);
    }
}
