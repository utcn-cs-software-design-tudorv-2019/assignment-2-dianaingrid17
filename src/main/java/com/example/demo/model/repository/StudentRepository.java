package com.example.demo.model.repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.example.demo.model.entity.Student;



public interface StudentRepository extends JpaRepository<Student,Long>{
	List<Student> findByName(String name);
	

}
