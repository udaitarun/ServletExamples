package com.createiq.ems.service;

import java.util.List;

import com.createiq.ems.dao.EmployeeDaoImpl;
import com.createiq.ems.model.Employee;

public class EmployeeServiceImpl implements EmployeeService {
	
	EmployeeDaoImpl dao = new EmployeeDaoImpl();


	@Override
	public List<Employee> getAll() {
		return dao.findAll();
	}

	@Override
	public void save(Employee employee) {
		dao.save(employee);

	}

	@Override
	public void update(Employee employee) {
		dao.update(employee);
	}

	@Override
	public void delete(int id) {
		dao.delete(id);
	}


}
