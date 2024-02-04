package com.LearningSpringApi.Crud.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Student {
	@Id 
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long stdId;
	private String stdName;
	private String rollNo;
	
	

}
