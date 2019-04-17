package com.example.demo.model.service;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.example.demo.model.entity.Student;
import com.example.demo.model.entity.Teacher;
import com.example.demo.utility.HibernateUtil;

public class TeacherServiceImpl implements TeacherService {

	Session session;
	@Override
	public void create(Teacher t) {
		// TODO Auto-generated method stub
		session =  HibernateUtil.getSession();
		Transaction transaction = null;
		try {
			transaction =  session.beginTransaction();
			session.save(t);
			transaction.commit();
			System.out.println("Teacher insered succesifully");
			
			
		}catch(HibernateException e)
		{
			transaction.rollback();
			e.printStackTrace();
		}finally {
			session.close();
		}

	}

	@Override
	public int update(Teacher t) {
		if(t.getId()<0)
		{
			return -1;
		}
		int rowC= -1;
		session = HibernateUtil.getSession();
		Transaction transaction = null;
		try{transaction = session.beginTransaction();
		String queryString = "update teacher set name = :name, email = :email where id = :id";
		Query query = session.createQuery(queryString);
		query.setInteger("id", (int) t.getId());
		query.setString("name", t.getName());
		query.setString("email", t.getEmailAddress());
		rowC = query.executeUpdate();
		System.out.println("Rows affected: "+rowC);
		transaction.commit();
		}catch(HibernateException e) {
			transaction.rollback();
			e.printStackTrace();
		}
		finally {
		session.close();}
		
		return rowC;
	}

	@Override
	public int delete(Teacher t) {
		// TODO Auto-generated method stub
		if(t.getId()<0)
			return -1;
		session = HibernateUtil.getSession();
		Transaction transaction =null;
		int rowC = -1;
		try {
			transaction = session.beginTransaction();
			String queryString = "delete from teacher where id = :id";
			Query query = session.createQuery(queryString);
			query.setInteger("id", (int) t.getId());
			rowC = query.executeUpdate();
			System.out.println("Rows affected: "+rowC);
			transaction.commit();
		}catch(HibernateException e)
		{
			transaction.rollback();
			e.printStackTrace();
		}finally {
			session.close();
		}
		return rowC;
	}

	@Override
	public List<Teacher> getAllTeachers() {
		// TODO Auto-generated method stub
		List<Teacher> teachers=null;
		session = HibernateUtil.getSession();
		Transaction transaction =null;
		try {
			transaction = session.beginTransaction();
			String queryString = "select * from teacher";
			@SuppressWarnings("rawtypes")
			Query query = session.createQuery(queryString);
			teachers = query.list();
			transaction.commit();
		}catch(HibernateException e)
		{
			transaction.rollback();
			e.printStackTrace();
		}finally {
			session.close();
		}
		
		return teachers;
	}

}
