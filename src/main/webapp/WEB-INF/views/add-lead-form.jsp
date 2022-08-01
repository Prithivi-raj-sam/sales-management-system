<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Lead Form</title>
</head>
<body style="background-color:#3d403d; color:white;">
	<div id="root">
		<div id="form">
			<form:form action="addlead" method="post" modelAttribute="addlead">
				<div>
					<label for="leed_id">Lead id</label>
					<div>
						<form:input path="leed_id" />
					</div>
				</div>
				<div>
					<label for="account_id">Account Id</label>
					<div>
						<form:input path="account_id" />
					</div>
				</div>
				<div>
					<label for="marketer_id">Marketer Id</label>
					<div>
						<form:input path="marketer_id" />
					</div>
				</div>
				<div>
					<label for="channel">Channel</label>
					<div>
						<form:input path="channel" />
					</div>
				</div>
				<div>
					<label for="status">StatusS</label>
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
		document.getElementById("div1").innerHTML="1 Lead added";
	}
	</script>
</body>
</html>