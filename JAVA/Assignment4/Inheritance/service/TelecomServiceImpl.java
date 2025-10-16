package com.Inheritance.service;


import java.util.Collection;
import java.util.List;

import com.Inheritance.Dao.CustomerDao;
import com.Inheritance.Dao.CustomerDaoImpl;
import com.Inheritance.Dao.VendorDao;
import com.Inheritance.Dao.VendorDaoImpl;
import com.Inheritance.beans.Customer;
import com.Inheritance.beans.Vendor;

public class TelecomServiceImpl implements TelecomService {
    private CustomerDao customerDAO = new CustomerDaoImpl();
    private VendorDao vendorDAO = new VendorDaoImpl();

    public void addCustomer(Customer c) {
        customerDAO.addCustomer(c);
    }

    public void deleteCustomer(String id) {
        customerDAO.deleteCustomer(id);
    }

    public Customer getCustomer(String id) {
        return customerDAO.getCustomer(id);
    }

    public Collection<Customer> listCustomers() {
        return customerDAO.getAllCustomers();
    }

    public void updateCustomerPlan(String id, String newPlan) {
        Customer c = customerDAO.getCustomer(id);
        if (c != null) c.setPlan(newPlan);
    }

    public void addVendor(Vendor v) {
        vendorDAO.addVendor(v);
    }

    public void deleteVendor(String id) {
        vendorDAO.deleteVendor(id);
    }

    public Vendor getVendor(String id) {
        return vendorDAO.getVendor(id);
    }

    public Collection<Vendor> listVendors() {
        return vendorDAO.getAllVendors();
    }

    public void updateVendorProducts(String id, List<String> newProducts) {
        Vendor v = vendorDAO.getVendor(id);
        if (v != null) v.setProducts(newProducts);
    }
}
