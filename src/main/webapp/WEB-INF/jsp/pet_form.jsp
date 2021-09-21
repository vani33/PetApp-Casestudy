<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<a href = "pets">Home</a>

<a href="petDetail">AddPet</a>
<a href="logout">Logout</a><br><br><br>
<form:form method="post" action="addPet" modelAttribute="pet">
	<h1>Add New Pet</h1>
	
	<table>
		<tr>
			<form:hidden path="id"></form:hidden>
			<td>Name :</td>
			<td><form:input path="name" id="name" /></td>

			<br>
			<br>
		</tr>

		<tr>
			<td>Place:</td>
			<td><form:input path="place" id="place" /></td>

			<br>
			<br>
		</tr>
		<tr>
			<td>Age :</td>
			<td><form:input path="age" id="age" /></td>

			<br>
			<br>

		</tr>
		<tr>
			<td><br /></td>
			<td><input type="submit" value="Save" /></td>
			<td><br /></td>
			<td><input type="submit" value="Cancel" /></td>
		</tr>
	</table>

</form:form>
