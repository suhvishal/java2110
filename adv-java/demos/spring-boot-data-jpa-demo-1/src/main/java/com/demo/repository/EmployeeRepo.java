package com.demo.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.demo.entities.Employee;

@Repository
public interface EmployeeRepo extends CrudRepository<Employee, Long> {

//	 void delete(Employee entity)
//   void deleteAll()
//   long count()
//   Optional<Employee> findById(Long id)
//   Iterable<Employee> findAll()
//   <? extends Employee> save(Employee entity)
	
	
	@Query("SELECT e From Employee e where e.city=:city")
	public List<Employee> getAllEmployeesByCity(@Param("city") String city);
	
	//Query method
	public List<Employee> findAllByCity(String city);
	
	public List<Employee> findAllBySalaryGreaterThan(double salary);
	
	public Employee findByFnameAndLname(String fn, String ln);
	
}
