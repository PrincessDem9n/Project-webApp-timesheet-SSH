<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home Page</title>
</head> 
<body>

<h2>Welcome to Mott MacDonald Timesheet Platform</h2><br>
<h2> Please login to begin</h2>
<h3>adding to test</h3>
	
	<form id="login" name="login" action="loginservlets" method="post">
		Enter your employee ID: <input id="yourempID" type="text" name="yourempID" size="20"><br>
		Enter your password: <input id="yourPWd" type="text" name="yourPwd" size="20">
<!-- Implement submit button w/type = submit to perform the request when clicked -->
		<input id="Call Login Servlet" type="submit" value="Call Login Servlet"/>
	</form>

</body>
</html>