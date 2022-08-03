package com.createiq.ems.queries;

public interface EmployeeQueries {
	
	String INSERT_EMP = "INSERT INTO EMPLOYEE VALUES(?,?,?,?)";
	String FIND_ALL_EMPLOYEE="SELECT * FROM EMPLOYEE";
	String DELETE_BY_ID = "DELETE FROM EMPLOYEE WHERE ENO=?";
	String UPDATE_EMP = "UPDATE EMPLOYEE SET ENAME=?, SALARY=?, EMAIL=? WHERE ENO=?";

}
