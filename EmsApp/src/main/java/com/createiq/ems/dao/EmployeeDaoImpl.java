package com.createiq.ems.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.createiq.ems.model.Employee;
import com.createiq.ems.queries.EmployeeQueries;
import com.createiq.ems.util.ConnectionUtil;


import com.createiq.ems.model.Employee;

public class EmployeeDaoImpl implements EmployeeDAO {

	@Override
	public List<Employee> findAll() {
		Connection connection = ConnectionUtil.getConnection();
		PreparedStatement ps = null;
		ResultSet resultSet = null;
		try {
			ps = connection.prepareStatement(EmployeeQueries.FIND_ALL_EMPLOYEE);
			resultSet = ps.executeQuery();
			List<Employee> employees = new ArrayList<>();
			while (resultSet.next()) {
				Employee employee = new Employee();
				employee.setEid(resultSet.getInt(1));
				employee.setEname(resultSet.getString(2));
				employee.setEsal(resultSet.getDouble(3));
				employee.setEmail(resultSet.getString(4));
				employees.add(employee);
			}
			return employees;

		} catch (SQLException e) {
			e.printStackTrace();
		}

		ConnectionUtil.closeConnection(resultSet, ps);
		return null;
	}

	@Override
	public void save(Employee employee) {
		Connection connection = null;
		PreparedStatement ps = null;
		try {
			connection = ConnectionUtil.getConnection();
			ps = connection.prepareStatement(EmployeeQueries.INSERT_EMP);
			ps.setInt(1, employee.getEid());
			ps.setString(2, employee.getEname());
			ps.setDouble(3, employee.getEsal());
			ps.setString(4, employee.getEmail());
			ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		ConnectionUtil.closeConnection(ps);

	}

	@Override
	public void update(Employee employee) {
		Connection connection = null;
		PreparedStatement ps = null;
		try {
			connection = ConnectionUtil.getConnection();
			ps = connection.prepareStatement(EmployeeQueries.UPDATE_EMP);
			ps.setInt(4, employee.getEid());
			ps.setString(1, employee.getEname());
			ps.setDouble(2, employee.getEsal());
			ps.setString(3, employee.getEmail());
			ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		ConnectionUtil.closeConnection(ps);

	}

	@Override
	public void delete(int id) {
		Connection connection=null;
		PreparedStatement ps=null;
		try {
			connection=ConnectionUtil.getConnection();
			ps=connection.prepareStatement(EmployeeQueries.DELETE_BY_ID);
			ps.setInt(1, id);
			ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

		
		
	}
	

