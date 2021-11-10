<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="resources/css/design.css" rel="stylesheet">
</head>
<body>

<h1 id="head1">Edit Department</h1>
	<h2 class="error" id="err">${errMsg}</h2>
	<form:form action="save" method="post"
		modelAttribute="department">
		<table id="logTab">
			
			<tr>
				<td><form:label path="departmentName">Department Name</form:label>
				</td>
				<td><form:input path="departmentName" required="required"></form:input>
				<%-- <form:errors path="departmentName" cssClass="error"/> --%>
				</td>
			</tr>
			<tr>
				<td><form:label path="location">Location</form:label></td>
				<td><form:input path="location" required="required"></form:input>
				<%-- <form:errors path="location" cssClass="error"/> --%>
				</td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="save"></td>
			</tr>
		</table>
		<form:hidden path="departmentId"/>
	</form:form>
	<h2 style="text-align: center;"><a href="home">Home</a></h2>

</body>
</html>