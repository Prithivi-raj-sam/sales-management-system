<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Get Opportunity By Id</title>
</head>
<body style="background-color:#3d403d; color:white;">
	<div id="root">
		<div id="form">
			<form:form action="" method="post" modelAttribute="opp">
				<div>
					<label for="opp_id">Opportunity id</label>
					<div>
						<form:input path="opp_id" readonly="true"/>
					</div>
				</div>
				<div>
					<label for="account_id">Account Id</label>
					<div>
						<form:input path="account_id" readonly="true"/>
					</div>
				</div>
				<div>
					<label for="marketer_id">Marketer Id</label>
					<div>
						<form:input path="marketer_id" readonly="true"/>
					</div>
				</div>
				<div>
					<label for="stages">Stages</label>
					<div>
						<form:input path="stages" readonly="true"/>
					</div>
				</div>
				<div>
					<label for="amount">Amount</label>
					<div>
						<form:input path="amount" readonly="true"/>
					</div>
				</div>
				<div>
					<label for="fiscal_period">Fiscal Period</label>
					<div>
						<form:input path="fiscal_period" readonly="true"/>
					</div>
				</div>
				<div>
					<label for="propability">Probability</label>
					<div>
						<form:input path="propability" readonly="true"/>
					</div>
				</div>
			</form:form>
		</div>
	</div>
</body>
</html>