<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Get Service Man By Id</title>
</head>
<body style="background-color:#3d403d; color:white;">
	<div id="root">
		<div id="form">
			<form:form action="" method="post" modelAttribute="servman">
				<div>
					<label for="servicer_id">Servicer id</label>
					<div>
						<form:input path="servicer_id" readonly="true"/>
					</div>
				</div>
				<div>
					<label for="ser_name">Name</label>
					<div>
						<form:input path="ser_name" readonly="true"/>
					</div>
				</div>
				<div>
					<label for="ser_contact">Contact</label>
					<div>
						<form:input path="ser_contact" readonly="true"/>
					</div>
				</div>
				<div>
					<label for="ser_email">Email</label>
					<div>
						<form:input path="ser_email" readonly="true"/>
					</div>
				</div>
				<div>
					<label for="ser_address">Address</label>
					<div>
						<form:input path="ser_address" readonly="true"/>
					</div>
				</div>
				<div>
					<label for="ser_profile">Profile</label>
					<div>
						<form:input path="ser_profile" type="image" readonly="true"/>
					</div>
				</div>
			</form:form>
 </div>
 </div>
</body>
</html>