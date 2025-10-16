package com.Inheritance.Dao;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import com.Inheritance.beans.Customer;

public class CustomerDaoImpl implements CustomerDao {
    private Map<String, Customer> customers = new HashMap<>();

    public void addCustomer(Customer c) {
        customers.put(c.getCustId(), c);
    }

    public void deleteCustomer(String id) {
        customers.remove(id);
    }

    public Customer getCustomer(String id) {
        return customers.get(id);
    }

    public Collection<Customer> getAllCustomers() {
        return customers.values();
    }
}
