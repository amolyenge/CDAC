package com.Inheritance.Dao;
import java.util.Collection;

import com.Inheritance.beans.Customer;

public interface CustomerDao {
    void addCustomer(Customer c);
    void deleteCustomer(String id);
    Customer getCustomer(String id);
    Collection<Customer> getAllCustomers();
}
