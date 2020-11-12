package com.zycus.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.zycus.dao.EmployeeRepository;

@Component
public class EmployeeService {
	
	@Autowired
	@Qualifier("jpa")
	private EmployeeRepository empRepo;

	public EmployeeService() {
		System.out.println("EmployeeService object is created....");
	}

	public EmployeeService(EmployeeRepository empRepo) {
		super();
		System.out.println("EmployeeService is created using parameterized constructor...");
		this.empRepo = empRepo;
	}

	 

	 
	
}
