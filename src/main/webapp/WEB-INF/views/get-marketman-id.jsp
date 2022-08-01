<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Get Marketing Man By Id</title>
</head>
<body style="background-color:#3d403d; color:white;">
	<div id="root">
		<div id="form">
			<form:form action="" method="post" modelAttribute="markteam">
				<div>
					<label for="marketer_id">Marketer id</label>
					<div>
						<form:input path="marketer_id" readonly="true"/>
					</div>
				</div>
				<div>
					<label for=m_name>Name</label>
					<div>
						<form:input path="m_name" readonly="true"/>
					</div>
				</div>
				<div>
					<label for="m_contact">Contact</label>
					<div>
						<form:input path="m_contact" readonly="true"/>
					</div>
				</div>
				<div>
					<label for="m_email">Email</label>
					<div>
						<form:input path="m_email" readonly="true"/>
					</div>
				</div>
				<div>
					<label for="m_address">Address</label>
					<div>
						<form:input path="m_address" readonly="true"/>
					</div>
				</div>
				<div>
					<label for="m_profile">Profile</label>
					<div>
						<form:input path="m_profile" readonly="true" type="image"/>
					</div>
				</div>
			</form:form>
		</div>
	</div>

</body>
</html>