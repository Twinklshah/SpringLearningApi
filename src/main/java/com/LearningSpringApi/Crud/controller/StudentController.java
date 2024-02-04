package com.LearningSpringApi.Crud.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.LearningSpringApi.Crud.model.Student;
import com.LearningSpringApi.Crud.service.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController {
	
	@GetMapping("/twinkle")
	public String Twinkle() {
		return "twinkle twinkle ajay's dear";
	}
	
	@Autowired
	private StudentService stuService;
	
	@PostMapping("/addStudent")
	public Student createStudent(@RequestBody Student student) {
		return stuService.addStudent(student);
	}
	
	@PostMapping("/students")
	public List<Student> ListStudent(@RequestBody List<Student> student) {
		return stuService.addStudents(student);
	}
	
	@GetMapping("/getStudent")
	public List<Student> getStudentData() {
		return stuService.getStudents();
	}
	
	@GetMapping("/getStudetByName/{name}")
	public List<Student> StudentByName(@PathVariable String name) {
		return stuService.getStudentByName(name);
	}
	@DeleteMapping("/delete/{id}")
     String deleteStudent (@PathVariable Long id) {
		return stuService.deleteStudentRecord(id);
	}
	
	@PutMapping("/update")
	public Student updateStudent(@RequestBody Student student) {
		return stuService.updateStudentById(student);
	}

}
