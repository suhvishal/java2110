package com.demo.services;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.entities.Employee;
import com.demo.repository.EmployeeRepo;

@Service
public class EmployeeService {

	
	@Autowired
	private EmployeeRepo employeeRepo;
	
	
	
	public List<Employee> getAllEmpByCity(String city){
		//return employeeRepo.getAllEmployeesByCity(city);
		return employeeRepo.findAllByCity(city);
	}
	
	public Employee save(Employee emp) {

		Employee e = null;
		
		if(emp.getId()==null) {
			e = employeeRepo.save(emp);
		}else {
			e = findById(emp.getId());
			if(e!=null) {
				e.setCity(emp.getCity());
				e.setFname(emp.getFname());
				e.setLname(emp.getLname());
				e.setSalary(emp.getSalary());
			}
		}
		
		return e;
	}
	
	@Transactional
	public Employee findById(Long id) {
		
		Optional<Employee> optionalEmp = employeeRepo.findById(id);
		Employee e = null;
		
		if(optionalEmp.isPresent()) {
			e = optionalEmp.get();
		}
		
		return e;
	}
	
	public List<Employee> findAll(){
		List<Employee> empList = (List<Employee>) employeeRepo.findAll();
		return empList;
	}
	
	public Employee deleteById(Long id) {
		Employee e = findById(id);
		if(e!=null) {
			employeeRepo.delete(e);
		}
		
		return e;
	}
}
