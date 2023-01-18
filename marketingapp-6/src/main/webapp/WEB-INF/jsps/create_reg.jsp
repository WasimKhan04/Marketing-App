<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html>
<html>
<head>





<meta charset="ISO-8859-1">
<title>Registration Form</title>
</head>
<body background="https://thumbs.dreamstime.com/b/back-to-school-concept-top-view-image-student-stationery-over-pastel-yellow-background-225948955.jpg"  />

	                      <h1 align="center">Welcome to Student Form</h1>
	                      
	<hr>
	<div align="center">
	<form action="saveReg" method="post" >
	
<pre >
First Name <input type="text" name="firstName" />
Last Name  <input type="text" name="lastName" />
Email      <input type="text" name="email" />
Mobile     <input type="text" name="mobile" />
           <input type="submit" value="Save" />

       </pre>
	</form>
	

	${msg}
	</div>
	<hr>
<div align="center">
	<a href="listAll">Go to All Student Form</a>
	
	</div>
</body>
</html>