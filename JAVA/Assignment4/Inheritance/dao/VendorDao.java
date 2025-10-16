package com.Inheritance.Dao;

import java.util.Collection;

import com.Inheritance.beans.Vendor;

public interface VendorDao {
    void addVendor(Vendor v);
    void deleteVendor(String id);
    Vendor getVendor(String id);
    Collection<Vendor> getAllVendors();
}
