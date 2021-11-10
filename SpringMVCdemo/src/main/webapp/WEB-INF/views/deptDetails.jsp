<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page isElIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>List of All Departments</h1>
	<table>
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
			</tr>
		</c:forEach>




	</table>

</body>
</html>