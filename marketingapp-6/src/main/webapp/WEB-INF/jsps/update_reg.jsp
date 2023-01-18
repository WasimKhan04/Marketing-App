<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration Form</title>
</head>
<body background="https://thumbs.dreamstime.com/b/back-to-school-concept-top-view-image-student-stationery-over-pastel-yellow-background-225948955.jpg">


	                          <h2 align="center">UPDATE STUDENT FORM</h2>
	                          
	<hr>
	<div align="center">
	
	<form action="saveUpdate" method="post" align="center">
	<pre >
 <input type="hidden" name="id"  value="${idd.id}" />
 First Name <input type="text" name="firstName" value="${idd.firstName}" />
 Last Name  <input type="text" name="lastName" value="${idd.lastName}" />
 Email      <input type="text" name="email"  value="${idd.email}" />
 Mobile     <input type="text" name="mobile" value="${idd.mobile}" />
           <input type="submit" value="Update" />

  </pre>
	</form>
	</div>
	
	<hr>
<div align="center">
	<a href="createStudentForm">Create Student Form</a>
	</div>
</body>
</html>