<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Lead</title>
</head>
<body style="background-color:#3d403d; color:white;">
	<div id="root">
		<div id="form">
			<form:form action="updatelead" method="post" modelAttribute="updatelead">
				<div>
					<label for="leed_id">Account id</label>
					<div>
						<form:input path="leed_id" />
					</div>
				</div>
				<div>
					<label for="account_id">Account Name</label>
					<div>
						<form:input path="account_id" />
					</div>
				</div>
				<div>
					<label for="marketer_id">Company</label>
					<div>
						<form:input path="marketer_id" />
					</div>
				</div>
				<div>
					<label for="channel">Role</label>
					<div>
						<form:input path="channel" />
					</div>
				</div>
				<div>
					<label for="status">Email</label>
					<div>
						<form:input path="status" />
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
		document.getElementById("div1").innerHTML="1 Lead updated";
	}
	</script>
</body>
</html>