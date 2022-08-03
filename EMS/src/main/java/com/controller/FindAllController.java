package com.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.model.Employee;
import com.service.EmployeeService;
import com.service.EmployeeServiceImpl;

public class FindAllController extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("find all controller");
		
		EmployeeService employeeService = new EmployeeServiceImpl();
		List<Employee>employees = employeeService.findAll();
		
		req.setAttribute("employees", employees);
		req.getRequestDispatcher("/findAll.jsp").forward(req, resp);
	}

}
