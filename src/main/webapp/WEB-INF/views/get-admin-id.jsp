<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>get Admin By Id</title>
</head>
<body style="background-color:#3d403d; color:white;">
	<div id="root">
		<div id="form">
			<form:form action="" method="post" modelAttribute="admin">
				
				<div>
					<label for="admin_id">Admin Id</label>
					<div>
						<form:input path="admin_id" readonly="true"/>
					</div>
				</div>
				<div>
					<label for="admin_name">Admin Name</label>
					<div>
						<form:input path="admin_name" readonly="true"/>
					</div>
				</div>
				<div>
					<label for="admin_password">Admin Password</label>
					<div>
						<form:input path="admin_password" readonly="true"/>
					</div>
				</div>
			</form:form>
		</div>
	</div>
</body>
</html>