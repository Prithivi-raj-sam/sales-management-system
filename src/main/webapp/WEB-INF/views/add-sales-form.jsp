<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Sales </title>
</head>
<body style="background-color:#3d403d; color:white;">
	<div id="root">
		<div id="form">
			<form:form action="addsales" method="post" modelAttribute="addsale">
				<div>
					<label for="sale_id">Sales Id</label>
					<div>
						<form:input path="sale_id" />
					</div>
				</div>
				<div>
					<label for="account_id">Account Id</label>
					<div>
						<form:input path="account_id" />
					</div>
				</div>
				<div>
					<label for="seller_id">Seller Id</label>
					<div>
						<form:input path="seller_id" />
					</div>
				</div>
				<div>
					<label for="stages">Stages</label>
					<div>
						<form:input path="stages" />
					</div>
				</div>
				<div>
					<label for="close_date">Close Date</label>
					<div>
						<form:input path="close_date" />
					</div>
				</div>
				<div>
					<label for="amount">Amount</label>
					<div>
						<form:input path="amount" />
					</div>
				</div>
				<div>
					<label for="status">Status</label>
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
	<div>${result}</div>
</body>
</html>