package com.demo.StudentRestDemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.StudentRestDemo.dto.StudentDto;
import com.demo.StudentRestDemo.service.StudentService;

@RestController
public class StudentController {

	@Autowired
	private StudentService service;
	
	@GetMapping("/students")
	public ResponseEntity<List<StudentDto>> getAllStudents(){
		List<StudentDto> slist = service.findAllStudents();
		return ResponseEntity.ok(slist);
	}
	
	@GetMapping("/student/{sid}")
	public ResponseEntity<StudentDto> findById(@PathVariable int sid){
		StudentDto s = service.getById(sid);
		if(s != null) {
			return ResponseEntity.ok(s);
		}else {
			return (ResponseEntity<StudentDto>) ResponseEntity.notFound();
			
		}
	}
	
	@GetMapping("/student/{lmarks}/{hmarks}")
	public ResponseEntity<List<StudentDto>> getByMarks(@PathVariable int lmarks , @PathVariable int hmarks){
		List<StudentDto> slist = service.findByMarks(lmarks,hmarks);
		if( slist != null) {
			return ResponseEntity.ok(slist);
		}else {
			return (ResponseEntity<List<StudentDto>>) ResponseEntity.notFound();
		}
	}
	
	@PostMapping("/add")
	public ResponseEntity<String> addStudent(@RequestBody StudentDto s){
		boolean status = service.addnewStudent(s);
		if(status) {
			return ResponseEntity.ok("Student Added Successfully.");
		}else {
			return ResponseEntity.ok("Error Occured");
		}
	}
	
	@PutMapping("/update/{sid}")
	public ResponseEntity<String> updateStudent(@RequestBody StudentDto s){
		boolean status = service.updatestudent(s);
		if(status) {
			return ResponseEntity.ok("Student Updated Successfully.");
		}else {
			return ResponseEntity.ok("Error Occured");
		}
	}
	
}
