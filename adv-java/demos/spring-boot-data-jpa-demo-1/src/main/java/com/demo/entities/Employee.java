package com.demo.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Employee {

	@Id
	@GeneratedValue
	private Long id;
	
	private String fname;
	private String lname;
	private String city;
	private double salary;
	
	public Employee() {
		super();
	}

	public Employee(Long id, String fname, String lname, String city, double salary) {
		super();
		this.id = id;
		this.fname = fname;
		this.lname = lname;
		this.city = city;
		this.salary = salary;
	}

	public Employee(String fname, String lname, String city, double salary) {
		super();
		this.fname = fname;
		this.lname = lname;
		this.city = city;
		this.salary = salary;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "\n\tEmployee [id=" + id + ", fname=" + fname + ", lname=" + lname + ", city=" + city + ", salary=" + salary
				+ "]";
	}
	
	
	
}
