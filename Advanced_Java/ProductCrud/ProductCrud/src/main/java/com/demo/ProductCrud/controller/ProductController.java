package com.demo.ProductCrud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.ProductCrud.dto.ProductDto;
import com.demo.ProductCrud.service.ProductService;

@RestController
public class ProductController {

	@Autowired
	private ProductService pservice;
	
	
	@GetMapping("/products")
	public ResponseEntity<List<ProductDto>> getallProducts(){
		List<ProductDto> plist = pservice.getAllProducts();
		return ResponseEntity.ok(plist);
	}
	
	
	@GetMapping("/products/{pid}")
	public ResponseEntity<ProductDto> getbyId(@PathVariable int pid){
		ProductDto p = pservice.getById(pid);
		if(p != null) {
			return ResponseEntity.ok(p);
		}else {
			return (ResponseEntity<ProductDto>) ResponseEntity.notFound();
		}
	}
	
	@GetMapping("/products/{lprice}/{hprice}")
	public ResponseEntity<List<ProductDto>> getbyprice(@PathVariable double lprice , @PathVariable double hprice){
		List<ProductDto> plist = pservice.getByPrice(lprice,hprice);
		if(plist != null) {
			return ResponseEntity.ok(plist);
		}else {
			return (ResponseEntity<List<ProductDto>>) ResponseEntity.notFound();
		}
	}
	
	@PostMapping("/products/{pid}")
	public ResponseEntity<String> addproduct(@RequestBody ProductDto p){
		boolean status = pservice.addProduct(p);
		if(status) {
			return ResponseEntity.ok("Added Successfully");
		}else {
			return ResponseEntity.ok("Error Occured");
		}
	}
	
	@PutMapping("/products/{pid}")
	public ResponseEntity<String> updateproduct(@RequestBody ProductDto p){
		boolean status = pservice.updateProduct(p);
		if(status) {
			return ResponseEntity.ok("Product Updated Successfully");
		}else {
			return ResponseEntity.ok("Error in Updating Product");
		}
	}
}
