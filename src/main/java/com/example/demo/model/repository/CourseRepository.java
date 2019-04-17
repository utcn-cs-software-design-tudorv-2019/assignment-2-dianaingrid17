package com.example.demo.model.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.entity.Course;



public interface CourseRepository extends JpaRepository<Course, Integer> {
	List<Course> findByName(String name);
}
