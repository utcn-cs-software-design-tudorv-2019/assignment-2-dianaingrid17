package com.example.demo.model.service;

import java.util.List;

import com.example.demo.model.entity.Teacher;

public interface TeacherService {
	public void create(Teacher t);
	public int update(Teacher t);
	public int delete(Teacher t);
	public List<Teacher> getAllTeachers();
	

}
