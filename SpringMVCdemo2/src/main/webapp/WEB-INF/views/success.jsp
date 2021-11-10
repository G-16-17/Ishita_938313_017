<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="resources/css/design.css" rel="stylesheet">
</head>
<body>
<h1 id="head1"> Customer Details Added Successfully</h1>
<h1 id="head1"> Customer Details</h1>
<table id="regTab">
	<tr>
		<td> First Name </td>
		<td> ${customer.firstName}</td>
	</tr>
	<tr>
		<td> Last Name </td>
		<td> ${customer.lastName}</td>
	</tr>
	<tr>
		<td> User Name </td>
		<td> ${customer.userName}</td>
	</tr>
	<tr>
		<td> Email Id </td>
		<td> ${customer.emailId}</td>
	</tr>
	<tr>
		<td> Gender </td>
		<td> ${customer.gender}</td>
	</tr>
	<tr>
		<td> Date Of Birth </td>
		<td> ${customer.dateOfBirth}</td>
	</tr>
	<tr>
		<td> Country </td>
		<td> ${customer.country}</td>
	</tr>
</table>

</body>
</html>