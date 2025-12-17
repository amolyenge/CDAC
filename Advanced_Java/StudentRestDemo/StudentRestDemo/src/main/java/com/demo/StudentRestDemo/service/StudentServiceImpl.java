package com.demo.StudentRestDemo.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.StudentRestDemo.beans.Student;
import com.demo.StudentRestDemo.dao.StudentDao;
import com.demo.StudentRestDemo.dto.StudentDto;
import com.demo.StudentRestDemo.mapper.StudentDtoMapper;

@Service
public class StudentServiceImpl implements StudentService{

	@Autowired
	private StudentDao sdao;
	
	@Override
	public List<StudentDto> findAllStudents() {
		List<Student> slist = sdao.findAll();
		List<StudentDto> slist1 = slist.stream()
				.map(st -> StudentDtoMapper.mapToStudentDto(st))
				.collect(Collectors.toList());
		
		return slist1;
	}

	@Override
	public StudentDto getById(int sid) {
		Optional<Student> s = sdao.findById(sid);
		if(s.isPresent()) {
			StudentDto st = StudentDtoMapper.mapToStudentDto(s.get());
			return st;
		}
		return null;
	}

	@Override
	public List<StudentDto> findByMarks(int lmarks, int hmarks) {
		List<Student> slist = sdao.findByMarks(lmarks,hmarks);
		if(slist.size() > 0 ) {
			List<StudentDto> slist1 = slist.stream()
					.map(st -> StudentDtoMapper.mapToStudentDto(st))
					.collect(Collectors.toList());
			return slist1;
		}
		return null;
	}

	@Override
	public boolean addnewStudent(StudentDto s) {
		Student s1 = StudentDtoMapper.mapToStudent(s);
		Student p2 = sdao.save(s1);
		return p2 != null;
	}

	@Override
	public boolean updatestudent(StudentDto s) {
		Student s1 = StudentDtoMapper.mapToStudent(s);
		Optional<Student> s2 = sdao.findById(s1.getSid());
		if(s2.isPresent()) {
			Student s3 = s2.get();
			s3.setSname(s.getSname());
			s3.setM1(s.getM1());
			s3.setM2(s.getM2());
			sdao.save(s3);
			return true;
		}
		return false;
	}

}
