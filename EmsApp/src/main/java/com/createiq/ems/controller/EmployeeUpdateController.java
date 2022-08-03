package com.createiq.ems.controller;

import java.io.IOException;

import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.createiq.ems.model.Employee;
import com.createiq.ems.service.EmployeeServiceImpl;
/**
 * Servlet implementation class EmployeeUpdateController
 */
public class EmployeeUpdateController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		EmployeeServiceImpl service = new EmployeeServiceImpl();
		PrintWriter writer = response.getWriter();
		int eid = Integer.parseInt(request.getParameter("eid"));
		String ename = request.getParameter("ename");
		double esal = Double.parseDouble(request.getParameter("esal"));
		String email = request.getParameter("email");
		Employee employee = new Employee(eid, ename, esal, email);
		service.update(employee);
		writer.print("update successfully......."+"<br>");
		writer.print("<a href='index.html'>home</a>");
		writer.close();
	}
}
