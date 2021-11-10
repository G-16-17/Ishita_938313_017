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
	<h1 id="head1">Login Page</h1>
	<h3 class="error" id="err">${errMsg}</h3>
	<form action="login" method="post">
		<table id="logTab">
			<tr>
				<td><label for="userName">User Name</label></td>
				<td><input type="text" name="userName" id="userName"
					required="required"></td>
			</tr>
			<tr>
				<td><label for="pass">Password</label></td>
				<td><input type="password" name="pass" id="pass"
					required="required"></td>
			</tr>
			<tr>
				<td><input type="reset" value="Clear"></td>
				<td><input type="submit" value="Login"></td>
			</tr>
		</table>



	</form>
</body>
</html>