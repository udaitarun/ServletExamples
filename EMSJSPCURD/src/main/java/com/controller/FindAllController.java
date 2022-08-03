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

/**
 * Servlet implementation class FindAllController
 */
public class FindAllController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("find all controller");

		EmployeeService employeeService = new EmployeeServiceImpl();
		List<Employee> employees = employeeService.findAll();

		request.setAttribute("employees", employees);
		request.getRequestDispatcher("/findAll.jsp").forward(request, response);
	}

}
