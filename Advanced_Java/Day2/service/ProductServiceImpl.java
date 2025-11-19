package com.demo.service;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;

import com.demo.beans.Product;
import com.demo.dao.ProductDao;
import com.demo.dao.ProductDaoImpl;

public class ProductServiceImpl implements ProductService{

	private ProductDao pdao;
	
	public ProductServiceImpl() {
		pdao= new ProductDaoImpl();
	}
	
	@Override
	public boolean addNewProduct() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Product id ");
		int pid = sc.nextInt();
		System.out.println("Product name");
		String pname = sc.next();
		System.out.println("Enter Quantity");
		int qty = sc.nextInt();
		System.out.println("Enter Product Price.");
		double price = sc.nextDouble();
		System.out.println("Enter mnfg Date (dd/MM/yyyy)");
		String dt = sc.next();
		LocalDate ldt = LocalDate.parse(dt,DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		Product p = new Product(pid,pname,qty,price,ldt);
		return pdao.save(p);
	}

	@Override
	public boolean deleteProduct(int id) {
		return pdao.removeById(id);
	}

	@Override
	public boolean modifyById(int id, int qty, double price) {
		return pdao.updateByID(id,qty,price);
	}

	@Override
	public Product getByID(int id) {
		return pdao.getID(id);
	}

	@Override
	public List<Product> getAllProducts() {
		return pdao.findAllProducts();
	}

	@Override
	public List<Product> sortByPrice() {
		return pdao.arrangeByPrice();
	}

	@Override
	public void closeMyConnection() {
		pdao.closeMyConnection();
		
	}

}
