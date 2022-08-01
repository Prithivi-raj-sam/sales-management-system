<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Account Details</title>
</head>
<body style="background-color:#3d403d; color:white;">
	<div id="root">
		<div id="form">
			<form:form action="updateaccount" method="post" modelAttribute="updateaccount">
				<div>
					<label for="account_id">Account id</label>
					<div>
						<form:input path="account_id" />
					</div>
				</div>
				<div>
					<label for="account_name">Account Name</label>
					<div>
						<form:input path="account_name" />
					</div>
				</div>
				<div>
					<label for="company">Company</label>
					<div>
						<form:input path="company" />
					</div>
				</div>
				<div>
					<label for="tittle">Role</label>
					<div>
						<form:input path="tittle" />
					</div>
				</div>
				<div>
					<label for="email">Email</label>
					<div>
						<form:input path="email" />
					</div>
				</div>
				<div>
					<label for="contact">Contact</label>
					<div>
						<form:input path="contact" />
					</div>
				</div>
				<div>
					<label for="address">Address</label>
					<div>
						<form:input path="address" />
					</div>
				</div>
				<div>
					<label for="account_type">Account_Type</label>
					<div>
						<form:input path="account_type" />
					</div>
				</div>
				<div>
					<form:button id="button">Update</form:button>
				</div>
			</form:form>
		</div>
	</div>
	<div id="div1"></div>
	
	<script>
	document.getElementById("button").onclick=function(){
		document.getElementById("div1").innerHTML="1 Account update";
	}
	</script>
	</body>
</html>