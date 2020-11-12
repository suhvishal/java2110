package com.example.demo.entities;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeRepository empRepo;

	@Transactional
	public Employee getEmployeeById(Long id) {
		Employee e1 = null;
		Optional<Employee> optionalEmp1 = empRepo.findById(id);
		if(optionalEmp1.isPresent()) {
			e1 = optionalEmp1.get();
		}
		
		return e1;
	}
}
