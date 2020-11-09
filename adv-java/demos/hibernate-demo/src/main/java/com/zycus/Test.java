package com.zycus;

import com.zycus.dao.EmployeeDAO;
import com.zycus.entities.Employee;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EmployeeDAO employeeDAO = new EmployeeDAO();
//		Employee emp = new Employee("Prakash", "Mumbai", 2000.00);
//       
//		employeeDAO.saveEmployee(emp);
		
//		Employee e1 = employeeDAO.getEmployee(1L);
//		System.out.println(e1);
		
//		Employee emp = new Employee(2L, "Deepak","Pune", 4000.00 );
//       
//		employeeDAO.updateEmployee(emp);
        
		
		Employee e1 = employeeDAO.getEmployee(1L);
		System.out.println(e1);
		
		employeeDAO.deleteEmployee(e1);
	}

}
