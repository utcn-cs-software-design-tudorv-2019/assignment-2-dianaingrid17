package com.example.demo.controller;


import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JFrame;

import com.example.demo.view.View_Admin;



public class Controller_Admin implements ActionListener {

	View_Admin view_admin;
	
	public Controller_Admin(View_Admin view_admin) {
		// TODO Auto-generated constructor stub
		this.view_admin=view_admin;
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		Object source = arg0.getSource();
		
		if(source == view_admin.getAddStudent())
		{
			String name, email;
			try {
				name = view_admin.getName_textField().getText();
				email = view_admin.getEmail_textField().getText();
				
				
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		if(source == view_admin.getEditStudent())
		{
			String name,email;
			int id;
			try {
				id = Integer.parseInt(view_admin.getId_textField().getText());
				name = view_admin.getName_textField().getText();
				email = view_admin.getEmail_textField().getText();
				
				
				
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		if(source == view_admin.getRemoveStudent())
		{
			int id;
			try {
				id = Integer.parseInt( view_admin.getId_textField().getText());
				
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		if(source == view_admin.getViewStudent())
		{
			
			
		}
		if(source == view_admin.getAcademicActivity())
		{
			int id;
			try {
				id = Integer.parseInt( view_admin.getId_textField().getText());
				
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		
	}

}
