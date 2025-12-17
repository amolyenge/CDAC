package com.demo.ProductCrud.service;

import java.util.List;

import com.demo.ProductCrud.dto.ProductDto;

public interface ProductService {

	List<ProductDto> getAllProducts();

	ProductDto getById(int pid);

	List<ProductDto> getByPrice(double lprice, double hprice);

	boolean addProduct(ProductDto p);

	boolean updateProduct(ProductDto p);


}
