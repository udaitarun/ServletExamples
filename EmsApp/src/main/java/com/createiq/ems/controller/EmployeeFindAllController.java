package com.createiq.ems.controller;

import java.io.IOException;

import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.createiq.ems.model.Employee;
import com.createiq.ems.service.EmployeeServiceImpl;


/**
 * Servlet implementation class EmployeeFindAllController
 */
public class EmployeeFindAllController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		EmployeeServiceImpl service = new EmployeeServiceImpl();
		List<Employee> employees = service.getAll();
		response.setContentType("text/html");
		PrintWriter writer = response.getWriter();
		writer.println("<table border='1px'>");
		writer.print("<tr><th>EID</th><th>ENAME</th><th>ESAL</th><th>EMAIL</th></tr>");

		for (Employee employee : employees) {
			writer.print("<tr>");
			writer.print("<td>" + employee.getEid() + "</td>");
			writer.print("<td>" + employee.getEname() + "</td>");
			writer.print("<td>" + employee.getEsal() + "</td>");
			writer.print("<td>" + employee.getEmail() + "</td>");
			writer.print("</tr>");
		}

		writer.println("</table>");
		writer.print("<a href='index.html'>home</a>");
		writer.close();
	}

	}


