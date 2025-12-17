package com.demo.StudentRestDemo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.demo.StudentRestDemo.beans.Student;

@Repository
public interface StudentDao extends JpaRepository<Student,Integer>{

	@Query(value="select * from student1 where m1 between :lmarks and :hmarks",nativeQuery=true)
	List<Student> findByMarks(int lmarks, int hmarks);
  
}
