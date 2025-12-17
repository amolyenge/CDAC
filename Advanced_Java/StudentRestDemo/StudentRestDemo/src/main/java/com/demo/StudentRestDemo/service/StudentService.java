package com.demo.StudentRestDemo.service;

import java.util.List;

import com.demo.StudentRestDemo.dto.StudentDto;

public interface StudentService {

	List<StudentDto> findAllStudents();

	StudentDto getById(int sid);

	List<StudentDto> findByMarks(int lmarks, int hmarks);

	boolean addnewStudent(StudentDto s);

	boolean updatestudent(StudentDto s);

}
