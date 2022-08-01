<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Profit</title>
</head>
<body style="background-color:#3d403d; color:white;">
	<div id="root">
		<div id="form">
			<form:form action="addprofit" method="post" modelAttribute="addprofit">
				<div>
					<label for="profit_id">Profit Id</label>
					<div>
						<form:input path="profit_id" />
					</div>
				</div>
				<div>
					<label for="income_id">Income Id</label>
					<div>
						<form:input path="income_id" />
					</div>
				</div>
				<div>
					<label for="expenditure_id">Expenditure Id</label>
					<div>
						<form:input path="expenditure_id" />
					</div>
				</div>
				<div>
					<label for="profit_Amount">Profit Amount</label>
					<div>
						<form:input path="profit_Amount" />
					</div>
				</div>
				<div>
					<form:button id="button">Add New</form:button>
				</div>
			</form:form>
		</div>
	</div>
	<div>${result}</div>
	
	
</body>
</html>