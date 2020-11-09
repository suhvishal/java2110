package com.zycus.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.zycus.entities.Employee;

public class EmployeeDAO {

	private SessionFactory sessionFactory;

	
	public EmployeeDAO() {
		Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        this.sessionFactory =  cfg.buildSessionFactory();
	}

	private void close() {
		sessionFactory.close();
	}

	public void saveEmployee(Employee emp) {
		
		Session session =  sessionFactory.openSession();
		
		session.beginTransaction();
		session.save(emp);
		session.getTransaction().commit();
		
		

	}

	
}
