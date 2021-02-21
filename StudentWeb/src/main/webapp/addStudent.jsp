<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add a New Student</title>
<link
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css"
	rel="stylesheet">
<link
	href="https://maxcdn.bootstrapcdn.com/bootswatch/3.3.6/cerulean/bootstrap.min.css"
	rel="stylesheet">
</head>
<body>

	<!-- ---Navbar Header -->
	<nav class="navbar navbar-inverse">
	<div class="container-fluid">
		<div class="navbar-header">
			<a class="navbar-brand" href="#">Student Records Management </a>
		</div>
		<ul class="nav navbar-nav">
			<li class="active"><a href="#">Home</a></li>
		</ul>

	</div>
	</nav>
	<!-- --Navbar end here -->
	<form action="webapi/student/insert/sid" method="post">
		<fieldset>
			<table border="1" cellspacing="0" cellpadding="6"
				class="table table-bordered table-striped">
				<caption>Updating Student Records</caption>
				<tbody>
					<tr>
						<td><label for="Student_no">Name</label></td>
						<td><input type="text" name="name"
							placeholder="First Name" /></td>
					</tr>
			<tr>
						<td><label for="lastName">Date of Birth</label></td>
						<td><input type="text" name="dob"
							placeholder="Last Name" /></td>
					</tr>
					<tr>
						<td><label for="age">Date of Joining</label></td>
						<td><input type="text" name="age" placeholder="doj" /></td>
					</tr>
					
					<tr>
						<td></td>
						<td><input type="submit" value="Submit" /></td>
					</tr>
				</tbody>
			</table>
		</fieldset>
	</form>

</body>
</html>