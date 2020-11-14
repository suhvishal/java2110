package com.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.demo.entities.Employee;
import com.demo.services.EmployeeService;

@SpringBootApplication
public class SpringBootDataJpaDemo1Application implements CommandLineRunner {

	@Autowired
	private EmployeeService employeeService;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringBootDataJpaDemo1Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
//	  Employee e = 	employeeService.save(new Employee("aaa", "bbbb", "Cccc", 1000.00));
//	  System.out.println(e);
		
	
//		employeeService.findById(10L);
//		employeeService.findById(10L);
//		employeeService.findById(10L);
		
		List<Employee> list = employeeService.getAllEmpByCity("Pune");
		System.out.println(list);
		
	
	}

}
