package com.createiq.ems.dao;

import java.util.List;

import com.createiq.ems.model.Employee;

public interface EmployeeDAO {
	
	void save(Employee employee);

	void update(Employee employee);

	public List<Employee> findAll();

	void delete(int id);

}
