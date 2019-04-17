package com.example.demo.controller;
 
import java.util.Arrays;

 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.entity.Course;
import com.example.demo.model.entity.Student;
import com.example.demo.model.entity.Teacher;
import com.example.demo.model.repository.CourseRepository;
import com.example.demo.model.repository.StudentRepository;
import com.example.demo.model.repository.TeacherRepository;


@RestController
public class WebController {
	@Autowired
	StudentRepository studentRepository;
	TeacherRepository teacherRepository;
	CourseRepository courseRepository;
	
	@RequestMapping("/save")
	  public String process(){
	    // save a single Customer
		courseRepository.saveAll(Arrays.asList(new Course("SSC",5),new Course("PS",6),new Course("SO",4)));
		teacherRepository.saveAll(Arrays.asList(new Teacher("Baruch","baruch@yahoo.com",1)));
	    studentRepository.save(new Student("Marcel", "marcel@yahoo.com"));
	    
	    // save a list of Customers
	    studentRepository.saveAll( Arrays.asList(new Student("Ionut", "ionut@yahoo.com",1,1), new Student("Calin", "calin@yahoo.com",1,2),
	                    new Student("David", "david@yahoo.com",2,3), new Student("Petru", "petru@yahoo.com",2,4)));
	    
	    return "Done";
	  }
	  
	  
	  @RequestMapping("/findall")
	  public String findAll(){
	    String result = "";
	    
	    for(Student s : studentRepository.findAll()){
	      result += s.toString() + "<br>";
	    }
	    
	    return result;
	  }
	  
	  @RequestMapping("/findbyid")
	  public String findById(@RequestParam("id") long id){
	    String result = "";
	    result = studentRepository.findById(id).toString();
	    return result;
	  }
	  
	  @RequestMapping("/findbyname")
	  public String fetchDataByLastName(@RequestParam("lastname") String lastName){
	    String result = "";
	    
	    for(Student cust: studentRepository.findByName(lastName)){
	      result += cust.toString() + "<br>"; 
	    }
	    
	    return result;
	  }

}
