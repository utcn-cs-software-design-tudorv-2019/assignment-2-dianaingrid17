package com.example.demo.model.service;

import java.util.List;

import com.example.demo.model.entity.Course;



public interface CourseService {

	public void create(Course c);
	public int update(Course c);
	public int delete(Course c);
	public List<Course> getAllCourses();
	
}
