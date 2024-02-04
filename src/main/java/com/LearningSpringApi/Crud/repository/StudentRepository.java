package com.LearningSpringApi.Crud.repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.LearningSpringApi.Crud.model.Student;

public interface StudentRepository extends JpaRepository<Student, Long>{

	List<Student> findByStdName(String stdName);
	

}
