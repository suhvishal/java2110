package com.zycus.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.zycus.bo.Employee;
import com.zycus.utils.DBConnect;
import com.zycus.utils.EmployeeCRUDOps;

public class EmployeeDAO {
	
	

	
	public List<Employee> getEmployees(){
		
		Connection connection = DBConnect.getConnection();
		List<Employee> list = new ArrayList();
		
		try {
			
			if(connection!=null) {
			
				PreparedStatement stmt = connection.prepareStatement(EmployeeCRUDOps.GET_ALL_EMPLOYEES);
				///
				//get data from db, construct a list 
				
			
			}else {
				System.out.println("could not connect to db");
			}
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return list;
		
	}
	
	
	//..
	
}
