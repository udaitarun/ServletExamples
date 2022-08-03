package com.createiq.ems.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.createiq.ems.service.EmployeeServiceImpl;

/**
 * Servlet implementation class EmployeeDeleteController
 */
public class EmployeeDeleteController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		EmployeeServiceImpl service = new EmployeeServiceImpl();
		PrintWriter writer = response.getWriter();
		int eid = Integer.parseInt(request.getParameter("eid"));
		writer.print("deleted..." + "<br>");
		service.delete(eid);
		writer.print("<a href='index.html'>home</a>");
		writer.close();
	}

}
