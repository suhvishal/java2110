package com.zycus.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.zycus.dao.EmployeeDAO;

@Component
public class EmployeeService {
	
	@Autowired
	private EmployeeDAO employeeDAO;

	public EmployeeService() {
		System.out.println("EmployeeService object is created....");
	}

	public EmployeeService(EmployeeDAO employeeDAO) {
		super();
		System.out.println("EmployeeService is created using parameterized constructor...");
		this.employeeDAO = employeeDAO;
	}

	public EmployeeDAO getEmployeeDAO() {
		return employeeDAO;
	}

	public void setEmployeeDAO(EmployeeDAO employeeDAO) {
		this.employeeDAO = employeeDAO;
	}
	
	
}
