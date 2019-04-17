package com.example.demo.model.service;

import java.util.List;

import com.example.demo.model.entity.Student;



public interface StudentService {

	public void create(Student s);
	public int update(Student s);
	public void delete(Student s);
	public List<Student> getAllStudents();
	
	
}
