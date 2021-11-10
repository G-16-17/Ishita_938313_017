<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="resources/css/design.css" rel="stylesheet">
</head>
<body>
	<h1>List of All Departments</h1>
	<table id="deptTab">
		<tr>
			<th>Department Number</th>
			<th>Department Name</th>
			<th>Location</th>
		</tr>
		<c:forEach var="department" items="${departmentList}">
			<tr>
				<td>${department.departmentId}</td>
				<td>${department.departmentName}</td>
				<td>${department.location}</td>
				<td><a href="delete?id=${department.departmentId}">Delete</a>
					&nbsp; &nbsp; <a href="edit?id=${department.departmentId}">Edit</a>
			</tr>
		</c:forEach>
	</table>
	<h1 id="head1">
		<a href="addDepartment">Add New Department</a>
	</h1>
</body>
</html>