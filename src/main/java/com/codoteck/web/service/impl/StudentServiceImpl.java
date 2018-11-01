package com.codoteck.web.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codoteck.web.entity.Student;
import com.codoteck.web.service.StudentService;
import com.codoteck.web.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService {
	
	@Autowired
	private StudentRepository studentRepository;

	@Override
	public Student save(Student student) {
		return studentRepository.save(student);
	}

	@Override
	public List<Student> getAll() {
		 return studentRepository.findAll();
	}

	@Override
	public void delete(Long id) {
		studentRepository.deleteById(id);;
	}

	@Override
	public Student findStudentById(Long id) {
		return studentRepository.getOne(id);
	}

}
