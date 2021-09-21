<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style>
.error{color:red}
</style>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form:form method="post" action="register" modelAttribute="user">
User Name: <form:input path="userName"/> <br><br>
Password: <form:input path="password"/>
<form:errors path="password" cssClass="error"/><br><br>
Confirm Password:<form:input path="confirmPassword"/> <br><br>
<form:errors path="confirmPassword" cssClass="error"/><br><br>
<input type="submit" value="Submit">
 </form:form>
 
</body>
</html>