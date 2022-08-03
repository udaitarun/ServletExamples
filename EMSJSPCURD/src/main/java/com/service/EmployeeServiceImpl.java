package com.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.model.Employee;

public class EmployeeServiceImpl implements EmployeeService {

	private static Map<Integer, Employee> employees = null;
	
	
	static {
		employees = new HashMap<Integer, Employee>();
		
		employees.put(1001, new Employee(1001, "Balaji", 20000.00));
		employees.put(1002, new Employee(1002, "vekatesh", 20000.00));
		employees.put(1003, new Employee(1003, "Mahesh", 20000.00));
		employees.put(1004, new Employee(1004, "varun", 20000.00));
		employees.put(1005, new Employee(1005, "satish", 20000.00));

	}

	@Override
	public List<Employee> findAll() {

		return new ArrayList<>(employees.values());
	}

	@Override
	public void add(Employee employee) {
		employees.put(employee.getId(), employee);

	}

	@Override
	public void update(Employee employee) {
		employees.put(employee.getId(), employee);

	}

	@Override
	public void delete(int id) {
		employees.remove(id);

	}

	@Override
	public Employee findById(int id) {

		return employees.get(id);
	}

}
