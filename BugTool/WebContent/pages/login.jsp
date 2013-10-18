<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
 
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login Page</title>
</head>
<body>
<form action="userLogin.html" method="post">
<h1>${message }</h1>
<table>
	<tr><td><spring:message code="login_id"/></td><td><input type="text" name="userName" id="userName"/></td></tr>
	<tr><td><spring:message code="login_password"/></td><td><input type="password" name="pswd" id="pswd"/></td></tr>
	<tr><td><input type="submit" value='<spring:message code='submit'/>' id="login"></input></td><td><input type="reset" value='<spring:message code='reset'/>' id=""/></td></tr>
	
</table>
</form>
</body>
</html>