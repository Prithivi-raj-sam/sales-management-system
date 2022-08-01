<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>get Lead By Id</title>
</head>
<body style="background-color:#3d403d; color:white;">
	<div id="root">
		<div id="form">
			<form:form action="" method="post" modelAttribute="lead">
				<div>
					<label for="leed_id">Account id</label>
					<div>
						<form:input path="leed_id" readonly="true"/>
					</div>
				</div>
				<div>
					<label for="account_id">Account Name</label>
					<div>
						<form:input path="account_id" readonly="true"/>
					</div>
				</div>
				<div>
					<label for="marketer_id">Company</label>
					<div>
						<form:input path="marketer_id" readonly="true"/>
					</div>
				</div>
				<div>
					<label for="channel">Role</label>
					<div>
						<form:input path="channel" readonly="true"/>
					</div>
				</div>
				<div>
					<label for="status">Email</label>
					<div>
						<form:input path="status" readonly="true"/>
					</div>
				</div>
				
			</form:form>
		</div>
	</div>
</body>
</html>