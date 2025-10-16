package com.Inheritance.Dao;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import com.Inheritance.beans.Vendor;

public class VendorDaoImpl implements VendorDao {
    private Map<String, Vendor> vendors = new HashMap<>();

    public void addVendor(Vendor v) {
        vendors.put(v.getVendorId(), v);
    }

    public void deleteVendor(String id) {
        vendors.remove(id);
    }

    public Vendor getVendor(String id) {
        return vendors.get(id);
    }

    public Collection<Vendor> getAllVendors() {
        return vendors.values();
    }
}
