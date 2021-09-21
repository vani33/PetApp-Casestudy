<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<a href = "pets">Home</a>
<a href="myPets">My Pets</a>
<a href="petDetail">AddPet</a>
<a href="logout">Logout</a><br><br><br>
	<table border="2">
	<tr>
	<th>Id</th>
	<th>Name</th>
	<th>Age</th>
	<th>Place</th>
	<th>Action</th>
	</tr>
		<c:forEach var="listPet" items="${ListOfPets}">
			<tr>
				<td><c:out value="${listPet.id}"></c:out></td>
				<td><c:out value="${listPet.name}"></c:out></td>
				<td><c:out value="${listPet.age}"></c:out></td>
				<td><c:out value="${listPet.place}"></c:out></td>
				<td><a href="buyPet?id=${listPet.id}">Buy</a>
				<%-- <td><a href="deletePet?id=${listPet.id}">Delete</a> --%>
			</tr>
		</c:forEach>

	</table>
</body>
</html>