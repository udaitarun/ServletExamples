<%@page import="com.model.Employee"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%-- <%@ include file = "header.jsp" %> --%>

	<jsp:include page="header.jsp"></jsp:include>
	<h1>Find All JSP</h1>
	<table>
		<tr>
			<td>Id</td>
			<td>Name</td>
			<td>salary</td>
		</tr>
		
		<c:forEach items="${employees}" var="employee">
			<tr>
				<td><c:out value="${employee.id}"></c:out></td>
				<td><c:out value="${employee.name}"></c:out></td>
				<td><c:out value="${employee.sal}"></c:out></td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>