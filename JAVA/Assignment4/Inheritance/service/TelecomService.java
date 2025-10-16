package com.Inheritance.service;

import java.util.Collection;
import java.util.List;

import com.Inheritance.beans.Customer;
import com.Inheritance.beans.Vendor;

public interface TelecomService {
    void addCustomer(Customer c);
    void deleteCustomer(String id);
    Customer getCustomer(String id);
    Collection<Customer> listCustomers();
    void updateCustomerPlan(String id, String newPlan);

    void addVendor(Vendor v);
    void deleteVendor(String id);
    Vendor getVendor(String id);
    Collection<Vendor> listVendors();
    void updateVendorProducts(String id, List<String> newProducts);
}
