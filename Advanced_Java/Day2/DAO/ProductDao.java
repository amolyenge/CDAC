package com.demo.dao;

import java.util.List;

import com.demo.beans.Product;

public interface ProductDao {

	boolean save(Product p);

	boolean removeById(int id);

	boolean updateByID(int id, int qty, double price);

	Product getID(int id);

	List<Product> findAllProducts();

	List<Product> arrangeByPrice();

	void closeMyConnection();

}
