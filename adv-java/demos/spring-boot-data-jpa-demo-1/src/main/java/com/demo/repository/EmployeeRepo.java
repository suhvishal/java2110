package com.demo.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.data.repository.CrudRepository;
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
}
