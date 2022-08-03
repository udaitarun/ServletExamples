package com.service;

import java.util.List;

import com.model.Employee;

public interface EmployeeService {
	
	List<Employee> findAll();

	public void add(Employee employee );
	
	public void update(Employee employee );
	
	public void delete(int id);
	
	Employee findById (int id);
	
	

}
