package com.example.demo.model.service;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.example.demo.model.entity.Student;
import com.example.demo.model.repository.StudentRepository;
import com.example.demo.utility.HibernateUtil;


public class StudentServiceImpl implements StudentService{

	private Session session;
	StudentRepository studentRepo;
	
	@Override
	public void create(Student s) {
		// TODO Auto-generated method stub
		
		session =  HibernateUtil.getSession();
		Transaction transaction = null;
		try {
			transaction =  session.beginTransaction();
			session.save(s);
			transaction.commit();
			System.out.println("Student insered succesifully");
			
			
		}catch(HibernateException e)
		{
			transaction.rollback();
			e.printStackTrace();
		}finally {
			session.close();
		}
		
		
	}

	@Override
	public int update(Student s) {
		// TODO Auto-generated method stub
		if(s.getId()<0)
		{
			return -1;
		}
		int rowC= -1;
		session = HibernateUtil.getSession();
		Transaction transaction = null;
		try{
			transaction = session.beginTransaction();
			Student newS = session.get(Student.class, s.getId());
			newS.setName(s.getName());
			newS.setEmailAddress(s.getEmailAddress());
			session.update(newS);
			transaction.commit();
		}catch(HibernateException e) {
			if(transaction!=null)
				transaction.rollback();
			e.printStackTrace();
		}
		finally {
		session.close();}
		
		return rowC;
		
	}


	public void delete(Student s) {
		// TODO Auto-generated method stub
		
		session = HibernateUtil.getSession();
		Transaction transaction =null;
		int rowC = -1;
		try {
			transaction = session.beginTransaction();
			session.delete(s);
			System.out.println("Rows affected: "+rowC);
			transaction.commit();
		}catch(HibernateException e)
		{
			if(transaction!=null)
				transaction.rollback();
			e.printStackTrace();
		}finally {
			session.close();
		}
		
	}

	@SuppressWarnings({ "unchecked", "deprecation" })
	@Override
	public List<Student> getAllStudents() {
		// TODO Auto-generated method stub
		List<Student> students=null;
		session = HibernateUtil.getSession();
		Transaction transaction =null;
		try {
			transaction = session.beginTransaction();
			students = session.createQuery("from student").list();
			transaction.commit();
		}catch(HibernateException e)
		{
			if(transaction != null)
				transaction.rollback();
			e.printStackTrace();
		}finally {
			session.close();
		}
		
		return students;
	}

}
