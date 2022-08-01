<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Service</title>
</head>
<body style="background-color:#3d403d; color:white;">
	<div id="root">
		<div id="form">
			<form:form action="updateservice" method="post" modelAttribute="updateserv">
				<div>
					<label for="service_id">Service Id</label>
					<div>
						<form:input path="service_id" />
					</div>
				</div>
				<div>
					<label for="ser_id">Servicer Id</label>
					<div>
						<form:input path="ser_id" />
					</div>
				</div>
				<div>
					<label for="sevice_date">Service Date</label>
					<div>
						<form:input path="sevice_date" />
					</div>
				</div>
				<div>
					<label for="account_id">Account Id</label>
					<div>
						<form:input path="account_id" />
					</div>
				</div>
				<div>
					<label for="issues">Issues</label>
					<div>
						<form:input path="issues" />
					</div>
				</div>
				<div>
					<label for="status">Status</label>
					<div>
						<form:input path="status" />
					</div>
				</div>
				<div>
					<label for="proirity">Priority</label>
					<div>
						<form:input path="proirity" />
					</div>
				</div>
				<div>
					<label for="channel">Channel</label>
					<div>
						<form:input path="channel" />
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