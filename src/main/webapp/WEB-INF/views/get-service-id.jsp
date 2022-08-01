<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Get Service By Id</title>
</head>
<body style="background-color:#3d403d; color:white;">
	<div id="root">
		<div id="form">
			<form:form action="" method="post" modelAttribute="serv">
				<div>
					<label for="service_id">Service Id</label>
					<div>
						<form:input path="service_id" readonly="true"/>
					</div>
				</div>
				<div>
					<label for="ser_id">Servicer Id</label>
					<div>
						<form:input path="ser_id" readonly="true"/>
					</div>
				</div>
				<div>
					<label for="sevice_date">Service Date</label>
					<div>
						<form:input path="sevice_date" readonly="true"/>
					</div>
				</div>
				<div>
					<label for="account_id">Account Id</label>
					<div>
						<form:input path="account_id" readonly="true"/>
					</div>
				</div>
				<div>
					<label for="issues">Issues</label>
					<div>
						<form:input path="issues" readonly="true"/>
					</div>
				</div>
				<div>
					<label for="status">Status</label>
					<div>
						<form:input path="status" readonly="true"/>
					</div>
				</div>
				<div>
					<label for="proirity">Priority</label>
					<div>
						<form:input path="proirity" readonly="true"/>
					</div>
				</div>
				<div>
					<label for="channel">Channel</label>
					<div>
						<form:input path="channel" readonly="true"/>
					</div>
				</div>
				
			</form:form>
		</div>
	</div>

</body>
</html>