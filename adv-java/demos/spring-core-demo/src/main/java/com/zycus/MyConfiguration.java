package com.zycus;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import com.zycus.dao.EmployeeDAO;


@ComponentScan(basePackages = { "com.zycus"})
public class MyConfiguration {
	
//	@Bean
//	public EmployeeDAO getEmployeeDAO() {
//		return new EmployeeDAO();
//	}
	
}
