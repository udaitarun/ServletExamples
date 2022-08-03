package com.service;

import java.util.ArrayList;
import java.util.List;

import com.model.Employee;

public class EmployeeServiceImpl  implements EmployeeService{

	@Override
	public List<Employee> findAll() {
		
		List<Employee>employees = new ArrayList<>();
		employees.add(new Employee(100, "udai", 200000.00));
		employees.add(new Employee(101, "akash", 180000.00));
		employees.add(new Employee(102, "mahesh", 160000.00));
		employees.add(new Employee(103, "kalyan", 140000.00));
		employees.add(new Employee(104, "laxman", 190000.00));
		
		return employees;
	}

}
