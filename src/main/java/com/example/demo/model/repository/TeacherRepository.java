package com.example.demo.model.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.example.demo.model.entity.Teacher;



public interface TeacherRepository extends JpaRepository<Teacher,Long>{

	List<Teacher> findByName(String name);
}
