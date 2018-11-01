package com.codoteck.web.service;

import java.util.List;

import com.codoteck.web.entity.Student;

public interface StudentService {
	
	Student save(Student student);
	
	List<Student> getAll();
	
	void delete(Long id);
	
	Student findStudentById(Long id);
	

}
