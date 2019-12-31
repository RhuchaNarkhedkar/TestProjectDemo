<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta http-equiv="Pragma" content="no-cache">
<meta http-equiv="Cache-Control" content="no-cache">
<meta http-equiv="Expires" content="sat, 01 Dec 2001 00:00:00 GMT">
<meta charset="ISO-8859-1">
<title>Employee Directory</title>
<link href="static/css/bootstrap.min.css" rel="stylesheet">
<link href="static/css/style.css" rel="stylesheet">
<script src="https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js"></script>
<script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
</head>
<body>
	<div role="navigation">
		<div class="navbar navbar-inverse">
			<a href="/getAllEmployees" class="navbar-brand">Show All Users</a>
		</div>
	</div>
	<div>
		<h3>New Employee</h3>
		<form:form class="form-horizontal" method="POST" action="saveEmployee"
			modelAttribute="employee">
			<div class="form-group">
				<label class="control-label col-md-3">First Name</label>
				<div class="col-md-4" style="display: inline-block">
					<form:input path="firstname" cssClass="form-control" />
				</div>
			</div>
			<div class="form-group">
				<label class="control-label col-md-3">Last Name</label>
				<div class="col-md-4" style="display: inline-block">
					<form:input path="lastname" cssClass="form-control" />
				</div>
			</div>
			<div class="form-group">
				<input type="submit" class="" value="Save Employee" />
			</div>
		</form:form>
	</div>

	<!-- Optional JavaScript -->
	<!-- jQuery first, then Popper.js, then Bootstrap JS -->
	<script src="static/js/jquery-1.11.1.min.js"></script>
	<script src="static/js/bootstrap.min.js"></script>


</body>
</html>