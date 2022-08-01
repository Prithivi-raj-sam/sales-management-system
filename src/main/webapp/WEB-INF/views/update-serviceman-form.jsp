<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Service Man</title>
</head>
<body style="background-color:#3d403d; color:white;">
	<div id="root">
		<div id="form">
			<form:form action="updateservman" method="post" modelAttribute="updateservman">
				<div>
					<label for="servicer_id">Servicer id</label>
					<div>
						<form:input path="servicer_id" />
					</div>
				</div>
				<div>
					<label for="ser_name">Name</label>
					<div>
						<form:input path="ser_name" />
					</div>
				</div>
				<div>
					<label for="ser_contact">Contact</label>
					<div>
						<form:input path="ser_contact" />
					</div>
				</div>
				<div>
					<label for="ser_email">Email</label>
					<div>
						<form:input path="ser_email" />
					</div>
				</div>
				<div>
					<label for="ser_address">Address</label>
					<div>
						<form:input path="ser_address" />
					</div>
				</div>
				<div>
					<label for="ser_profile">Profile</label>
					<div>
						<form:input path="ser_profile" type="file" accept=".png"/>
					</div>
				</div>
				<div>
					<form:button id="button">update</form:button>
				</div>
			</form:form>
		</div>
	</div>
	<div>${result}</div>

</body>
</html>