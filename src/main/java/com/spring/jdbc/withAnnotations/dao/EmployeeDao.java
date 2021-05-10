package com.spring.jdbc.withAnnotations.dao;

import com.spring.jdbc.withXML.entities.Employee;

import java.util.List;

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
