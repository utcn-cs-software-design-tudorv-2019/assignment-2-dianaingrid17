package com.example.demo.utility;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {

	private static HibernateUtil instance=new HibernateUtil();
    private SessionFactory sessionFactory;
    
    public static HibernateUtil getInstance(){
            return instance;
    }
    
    private HibernateUtil(){
        Configuration configuration = new Configuration();
        configuration.configure("hibernate.cfg.xml"); 
                
        sessionFactory = configuration.buildSessionFactory();
    }
    
    public static Session getSession(){
        Session session =  getInstance().sessionFactory.openSession();
        
        return session;
}
}
