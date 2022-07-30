<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title></title>
</head>
<body style="background-color:#3d403d; color:white;">
	<div id="root">
		<div id="form">
			<form:form action="" method="post" modelAttribute="salesman">
				<div>
					<label for="seller_id">Sales Man Id</label>
					<div>
						<form:input path="seller_id" readonly="true"/>
					</div>
				</div>
				<div>
					<label for="sel_name">Sales Man Name</label>
					<div>
						<form:input path="sel_name" readonly="true"/>
					</div>
				</div>
				<div>
					<label for="sel_contact">Contact Number</label>
					<div>
						<form:input path="sel_contact" readonly="true"/>
					</div>
				</div>
				<div>
					<label for="sel_email">Email</label>
					<div>
						<form:input path="sel_email" readonly="true"/>
					</div>
				</div>
				<div>
					<label for="sel_address">Address</label>
					<div>
						<form:input path="sel_address" readonly="true"/>
					</div>
				</div>
				<div>
					<label for="sel_profile">profile</label>
					<div>
						<form:input path="sel_profile" readonly="true"/>
					</div>
				</div>
			</form:form>
		</div>
	</div>
</body>
</html>