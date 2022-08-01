<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Territory</title>
</head>
<body style="background-color:#3d403d; color:white;">
	<div id="root">
		<div id="form">
			<form:form action="addterritory" method="post" modelAttribute="addter">
				<div>
					<label for="territory_id">Territory Id</label>
					<div>
						<form:input path="territory_id" />
					</div>
				</div>
				<div>
					<label for="territory_name">Territory Name</label>
					<div>
						<form:input path="territory_name" />
					</div>
				</div>
				<div>
					<label for="no_of_customers">No Of Customer</label>
					<div>
						<form:input path="no_of_customers" />
					</div>
				</div>
				<div>
					<form:button id="button">Add New</form:button>
				</div>
			</form:form>
		</div>
	</div>
	<div>${result}</div>
</body>
</html>