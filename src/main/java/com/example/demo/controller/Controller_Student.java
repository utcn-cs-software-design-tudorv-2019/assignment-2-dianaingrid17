package com.example.demo.controller;


import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import java.util.ArrayList;

import javax.swing.JFrame;

import com.example.demo.model.entity.Student;
import com.example.demo.model.service.StudentService;
import com.example.demo.view.View_Student;



/**
 * @author ingri
 *
 */
public class Controller_Student implements ActionListener{

	/**
	 * 
	 */
	private View_Student view_student ;
	
	private StudentService studentService;
	
	
	public Controller_Student(View_Student v) {
		// TODO Auto-generated constructor stub
		this.view_student = v;
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		Object source = arg0.getSource();
		if(source == view_student.getAddStudent())
		{
			String name, email;
			try {
				name = view_student.getName_textField().getText();
				email = view_student.getEmail_textField().getText();
				studentService.create(new Student(name,email,1,1));
				
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		if(source == view_student.getEditStudent())
		{
			String name,email;
			int id;
			try {
				
				name = view_student.getName_textField().getText();
				email = view_student.getEmail_textField().getText();
				studentService.update(new Student(name,email));
				
			}catch(Exception e)
			{
				e.printStackTrace();
			}
			
		}if(source == view_student.getRemoveStudent())
		{
			
			String name,email;
			try {
				name = view_student.getName_textField().getText();
				email = view_student.getEmail_textField().getText();
				studentService.delete(new Student(name,email));
				
				
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}if(source == view_student.getViewStudent())
		{
			List<Student> studentList = studentService.getAllStudents();
			for(Student s:studentList)
			{
				System.out.println(s.toString());
				
			}
		}
		
	}

}
