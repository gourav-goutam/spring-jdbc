package com.spring.jdbc.withXML.dao;

import java.util.List;

import com.spring.jdbc.withXML.entities.Employee;

public interface EmployeeDao {

	// Create
	public void insert(Employee e);

	// Read
	public Employee getById(int id);

	// Update
	public void update(Employee e);

	// Delete
	public void deleteById(int id);

	// Get All
	public List<Employee> getAll();

}
