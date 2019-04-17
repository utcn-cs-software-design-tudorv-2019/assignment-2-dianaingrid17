package com.example.demo.model.service;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.example.demo.model.entity.Course;
import com.example.demo.utility.HibernateUtil;

public class CourseServiceImpl implements CourseService {

	Session session;
	@Override
	public void create(Course c) {
		// TODO Auto-generated method stub
		session =  HibernateUtil.getSession();
		Transaction transaction = null;
		try {
			transaction =  session.beginTransaction();
			session.save(c);
			transaction.commit();
			System.out.println("Course insered succesifully");
			
			
		}catch(HibernateException e)
		{
			transaction.rollback();
			e.printStackTrace();
		}finally {
			session.close();
		}

	}

	@Override
	public int update(Course c) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(Course c) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Course> getAllCourses() {
		// TODO Auto-generated method stub
		return null;
	}

}
