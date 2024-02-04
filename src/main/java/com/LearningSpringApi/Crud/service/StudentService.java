package com.LearningSpringApi.Crud.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.LearningSpringApi.Crud.model.Student;
import com.LearningSpringApi.Crud.repository.StudentRepository;

@Service
public class StudentService {
	
  @Autowired
  private StudentRepository repository;
  
  public Student addStudent(Student std) {
	  return repository.save(std);
  }

  public List<Student> addStudents(List<Student> students){
	  return repository.saveAll(students);
  }
  
  public List<Student> getStudents(){
	  return repository.findAll();
  }
  
  public Optional<Student> getStudentById(Long id) {
	  return repository.findById(id);
	  
  }
  
  public List<Student> getStudentByName(String name) {
	  return repository.findByStdName(name);
  }
  
  public String deleteStudentRecord(long id) {
	  repository.deleteById(id);  
	  return "record deleted" +id;
  }
  
  public Student updateStudent(Student student) {
	  return repository.save(student);
  }
  
  public Student updateStudentById(Student student) {
	  
	  Long id =  student.getStdId();
	  Optional<Student> existingStudent = repository.findById(id); 
	  
	  if(existingStudent.isPresent()) {
		   
		  String name =  student.getStdName();
		  existingStudent.get().setStdName(name);  
	  }
	  return existingStudent.get(); 
  }
  
//  public List<Student> updateStudentByName(Student student) {
//	  List<Student> getstudentfromDb=repository.findByStdName(student.getStdName());
//	  if(getstudentfromDb.isEmpty()) {
//		 throw new Exception("data is null");
//	  }
//	  else {
//		  
//		  	  }
//  }
}
