package com.demo.StudentRestDemo.mapper;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import com.demo.StudentRestDemo.beans.Student;
import com.demo.StudentRestDemo.dto.StudentDto;

public class StudentDtoMapper {
   
	public static Student mapToStudent(StudentDto s) {
		return new Student(s.getSid(),s.getSname(),s.getM1(),s.getM2(),LocalDate.parse(s.getDob(),DateTimeFormatter.ofPattern("dd/MM/yyyy")));
	}
	
	
	public static StudentDto mapToStudentDto(Student st) {
		if(st.getDob() == null) {
			return new StudentDto(st.getSid(),st.getSname(),st.getM1(),st.getM2(),null);
		}else {
			return new StudentDto(st.getSid(),st.getSname(),st.getM1(),st.getM2(),st.getDob().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		}
	}
	
	
}
