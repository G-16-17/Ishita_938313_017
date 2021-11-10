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
<h1 id="head1">Add Customer</h1>
<form:form method="post" modelAttribute="customer" action="addCustomer">
	<table id="regTab">
		<tr>
			<td><form:label path="firstName">First Name</form:label></td>
			<td><form:input path="firstName"/> <form:errors path="firstName" cssClass="error"/></td>
		</tr>
		<tr>
			<td><form:label path="lastName">Last Name</form:label></td>
			<td><form:input path="LastName"/><form:errors path="lastName" cssClass="error"/></td>
		</tr>
		<tr>
			<td><form:label path="userName">User Name</form:label></td>
			<td><form:input path="userName"/><form:errors path="userName" cssClass="error"/></td>
		</tr>
		<tr>
			<td><form:label path="password">Password</form:label></td>
			<td><form:input path="password"/><form:errors path="password" cssClass="error"/></td>
		</tr>
		<tr>
			<td><form:label path="confirmPassword">Confirm Password</form:label></td>
			<td><form:input path="confirmPassword"/><form:errors path="confirmPassword" cssClass="error"/></td>
		</tr>
		<tr>
			<td><form:label path="emailId">Email Id</form:label></td>
			<td><form:input path="emailId" type="email"/><form:errors path="emailId" cssClass="error"/></td>
		</tr>
		<tr>
			<td><form:label path="gender">Gender</form:label></td>
			<td>
				<form:radiobutton path="gender" value="male" /> Male
				<form:radiobutton path="gender" value="female" /> Female
				<form:radiobutton path="gender" value="trans" /> TransGender
				<form:errors path="gender" cssClass="error" />
			</td>
		</tr>
		<tr>
			<td><form:label path="dateOfBirth">Date Of Birth</form:label></td>
			<td><form:input path="dateOfBirth" type="date"/><form:errors path="dateOfBirth" cssClass="error"/></td>
		</tr>
		<tr>
			<td><form:label path="country">Country</form:label></td>
			<td>
				<form:select path="country">
					<form:option value="">--Select--</form:option>
					<form:options items="${countries}"/>
				</form:select>
				<form:errors path="country" cssClass="error"/>
			</td>
		</tr>
		<tr>
				<td colspan="2" align="center"><input type="submit" value="Register"></td>
			</tr>
	</table>
</form:form>
</body>
</html>