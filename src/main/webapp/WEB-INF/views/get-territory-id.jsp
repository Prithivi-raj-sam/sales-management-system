<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Get Territory By Id</title>
</head>
<body style="background-color:#3d403d; color:white;">
	<div id="root">
		<div id="form">
			<form:form action="" method="post" modelAttribute="ter">
				<div>
					<label for="territory_id">Territory Id</label>
					<div>
						<form:input path="territory_id" readonly="true"/>
					</div>
				</div>
				<div>
					<label for="territory_name">Territory Name</label>
					<div>
						<form:input path="territory_name" readonly="true"/>
					</div>
				</div>
				<div>
					<label for="no_of_customers">No Of Customer</label>
					<div>
						<form:input path="no_of_customers" readonly="true"/>
					</div>
				</div>
			</form:form>
		</div>
	</div>

</body>
</html>