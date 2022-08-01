<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Admin</title>
</head>
<body style="background-color:#3d403d; color:white;">
	<div id="root">
		<div id="form">
			<form:form action="addadmin" method="post" modelAttribute="addadmin">
				
				<div>
					<label for="admin_id">Admin Id</label>
					<div>
						<form:input path="admin_id" />
					</div>
				</div>
				<div>
					<label for="admin_name">Admin Name</label>
					<div>
						<form:input path="admin_name" />
					</div>
				</div>
				<div>
					<label for="admin_password">Admin Password</label>
					<div>
						<form:input path="admin_password" />
					</div>
				</div>
				
				<div>
					<form:button id="button">Add New</form:button>
				</div>
			</form:form>
		</div>
	</div>
	<div id="div1"></div>
	
	<script>
	document.getElementById("button").onclick=function(){
		document.getElementById("div1").innerHTML +="1 Admin added";
	}
	</script>
</body>
</html>