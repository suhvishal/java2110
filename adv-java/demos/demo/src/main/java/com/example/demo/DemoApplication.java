package com.example.demo;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.entities.Employee;
import com.example.demo.entities.EmployeeRepository;
import com.example.demo.entities.EmployeeService;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

	
	@Autowired
	private EmployeeService empService;;
	
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	@Transactional
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		
		empService.getEmployeeById(1L);
		empService.getEmployeeById(1L);
		empService.getEmployeeById(1L);
		empService.getEmployeeById(1L);
		empService.getEmployeeById(1L);
		
		
	}

}
