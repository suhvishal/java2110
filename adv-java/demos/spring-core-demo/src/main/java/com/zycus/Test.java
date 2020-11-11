package com.zycus;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zycus.dao.EmployeeDAO;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub



		//ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
		
		ApplicationContext context = new AnnotationConfigApplicationContext(MyConfiguration.class, Configuration2.class);
		
		EmployeeDAO employeeDAO = context.getBean(EmployeeDAO.class);
		
		
	}

}
