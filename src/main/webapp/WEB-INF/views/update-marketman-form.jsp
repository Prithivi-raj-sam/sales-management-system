<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Marketing Man</title>
</head>
<body style="background-color:#3d403d; color:white;">
	<div id="root">
		<div id="form">
			<form:form action="updatemark" method="post" modelAttribute="updatemarkman">
				<div>
					<label for="marketer_id">marketer id</label>
					<div>
						<form:input path="marketer_id" />
					</div>
				</div>
				<div>
					<label for=m_name>Name</label>
					<div>
						<form:input path="m_name" />
					</div>
				</div>
				<div>
					<label for="m_contact">Contact</label>
					<div>
						<form:input path="m_contact" />
					</div>
				</div>
				<div>
					<label for="m_email">Email</label>
					<div>
						<form:input path="m_email" />
					</div>
				</div>
				<div>
					<label for="m_address">Address</label>
					<div>
						<form:input path="m_address" />
					</div>
				</div>
				<div>
					<label for="m_profile">Profile</label>
					<div>
						<form:input path="m_profile" type="file" accept=".png"/>
					</div>
				</div>
				<div>
					<form:button id="button">update</form:button>
				</div>
			</form:form>
		</div>
	</div>
	<div id="div1"></div>
	
	<script>
	document.getElementById("button").onclick=function(){
		document.getElementById("div1").innerHTML="1 Marketing Man updated";
	}
	</script>
</body>
</html>