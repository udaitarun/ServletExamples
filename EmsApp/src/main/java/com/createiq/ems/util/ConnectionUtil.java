package com.createiq.ems.util;

import java.io.IOException;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class ConnectionUtil {
	
	private static Connection connection = null;
	private static Properties properties = null;
	
	

	
	static {
		try {
			properties = new Properties();
			try {
				properties.load(ConnectionUtil.class.getClassLoader()
						.getResourceAsStream("db.properties"));
				Class.forName(properties.getProperty("driver"));
			} catch (IOException e) {
				e.printStackTrace();
			}

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	public static Connection getConnection() {

		try {
			connection = DriverManager.getConnection(properties.getProperty("url"),
					properties.getProperty("user"), properties.getProperty("password"));
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return connection;
	}

	public static void closeConnection(Connection connection) {

		try {
			if (connection != null)
				connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static void closeConnection(Statement statement) {

		try {
			if (statement != null)
				statement.close();
			closeConnection(connection);
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public static void closeConnection(ResultSet rs, Statement statement) {

		try {
			if (rs != null)
				closeConnection(statement);
			rs.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public static void main(String[] args) {
		System.out.println(getConnection());
	}
}
