package com.demo.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.stereotype.Repository;

import com.demo.entities.Employee;

@RepositoryRestResource
public interface EmployeeRespository extends JpaRepository<Employee, Long>{

	//@Query - create a custom query 
	
	@Query("Select e From Employee e Where e.city=:city")
	List<Employee> getEmployeesByCity(@Param("city") String city);
	
	List<Employee> findAllByCity(String city);
	
	@RestResource(path = "bycityandsal")
	List<Employee> findAllByCityAndSalaryGreaterThan(String city, double salary);
	
}
