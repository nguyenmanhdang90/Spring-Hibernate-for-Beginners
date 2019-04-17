<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Student registration form</title>
</head>
<body>

	<form:form method="GET" action="processForm" modelAttribute="student">
	First name: <form:input path="firstName" />
	<br />
	Last name: <form:input path="lastName" />
	<br />
	<input type="submit" value="Submit" />
	</form:form>

</body>
</html>