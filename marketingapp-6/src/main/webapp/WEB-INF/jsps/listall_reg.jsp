<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body background="https://thumbs.dreamstime.com/b/back-to-school-concept-top-view-image-student-stationery-over-pastel-yellow-background-225948955.jpg">

                             <h1 align="center"> ALL STUDENT FORM DETAILS </h1>
                             
                             <hr>
                             
                             
	<form action="listall" method="post">
		<table border="10" align="center">
			<tr>
				<th>First Name</th>
				<th>Last Name</th>
				<th>Email</th>
				<th>Mobile</th>
				<th>Delete</th>
				<th>Update</th>
			</tr>

			<c:forEach var="j" items="${all}">

				<tr>
					<td>${j.firstName}</td>
					<td>${j.lastName}</td>
					<td>${j.email}</td>
					<td>${j.mobile}</td>
					<td><a href="delete?id=${j.id}">Delete</a></td>
					<td><a href="update?id=${j.id}">Update</a></td>
				</tr>

			</c:forEach>


		</table>

	</form>
	
	<hr>
	<div align="center">
	<a href="createStudentForm">Create Student Form</a>
	
	<br>
	
	<a href="listAll">Go to All Student Form</a>
	</div>
</body>
</html>