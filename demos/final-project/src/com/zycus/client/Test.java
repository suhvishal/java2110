package com.zycus.client;

import com.zycus.dao.EmployeeDAO;
import com.zycus.services.EmployeeService;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EmployeeService employeeService = new EmployeeService(new EmployeeDAO());
		
		employeeService.getEmployees();
	}

}
