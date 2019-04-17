package com.example.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.example.demo.model.entity.Student;
import com.example.demo.model.service.StudentServiceImpl;



@SpringBootApplication
@Configuration
@EnableAutoConfiguration
@ComponentScan({"com.example.demo.controller","com.example.demo.model","com.example.demo.repository","com.example.demo.service"})
public class SchoolManagementApplication implements CommandLineRunner{

	
	public static void main(String[] args) {
		//SpringApplication.run(SchoolManagementApplication.class, args);
		StudentServiceImpl ss = new StudentServiceImpl();
		Student s = new Student("Ionut", "ionut@yahoo.com",1,1);
		
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		//studentRepository.deleteAll();
		
	}

}
