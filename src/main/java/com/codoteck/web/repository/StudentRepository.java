package com.codoteck.web.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.codoteck.web.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long>{
	// add more : builder or sql native
}
