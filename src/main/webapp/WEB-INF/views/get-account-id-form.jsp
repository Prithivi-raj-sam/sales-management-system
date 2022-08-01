<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
        <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Get Account By Id</title>
</head>
<body style="background-color:#3d403d; color:white;">
	<div id="root">
		<div id="form">
			<form:form action="" method="post" modelAttribute="getaccount">
				<div>
					<label for="account_id">Account Id</label>
					<div>
						<form:input path="account_id" readonly="true"/>
					</div>
				</div>
				<div>
					<label for="account_name">Account Name</label>
					<div>
						<form:input path="account_name" readonly="true"/>
					</div>
				</div>
				<div>
					<label for="company">Company</label>
					<div>
						<form:input path="company" readonly="true"/>
					</div>
				</div>
				<div>
					<label for="tittle">Role</label>
					<div>
						<form:input path="tittle" readonly="true"/>
					</div>
				</div>
				<div>
					<label for="email">Email</label>
					<div>
						<form:input path="email" readonly="true"/>
					</div>
				</div>
				<div>
					<label for="contact">Contact</label>
					<div>
						<form:input path="contact" readonly="true"/>
					</div>
				</div>
				<div>
					<label for="address">Address</label>
					<div>
						<form:input path="address" readonly="true"/>
					</div>
				</div>
				<div>
					<label for="account_type">Account Type</label>
					<div>
						<form:input path="account_type" readonly="true"/>
					</div>
				</div>
			</form:form>
		</div>
	</div>
</html>