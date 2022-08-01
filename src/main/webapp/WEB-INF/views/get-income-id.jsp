<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Get Income By Id</title>
</head>
<body style="background-color:#3d403d; color:white;">
	<div id="root">
		<div id="form">
			<form:form action="" method="post" modelAttribute="getincome">
				<div>
					<label for="income_id">Income id</label>
					<div>
						<form:input path="income_id" readonly="true"/>
					</div>
				</div>
				<div>
					<label for="income_from_date">Income From Date</label>
					<div>
						<form:input path="income_from_date" readonly="true"/>
					</div>
				</div>
				<div>
					<label for="income_to_date">Income To Date</label>
					<div>
						<form:input path="income_to_date" readonly="true"/>
					</div>
				</div>
				<div>
					<label for="planned_leads">Planned Leads</label>
					<div>
						<form:input path="planned_leads" readonly="true"/>
					</div>
				</div>
				<div>
					<label for="commited_leads">Committed Leads</label>
					<div>
						<form:input path="commited_leads" readonly="true"/>
					</div>
				</div>
				<div>
					<label for="planned_sales">Planned Sales</label>
					<div>
						<form:input path="planned_sales" readonly="true"/>
					</div>
				</div>
				<div>
					<label for="closed_sales">Closed Sales</label>
					<div>
						<form:input path="closed_sales" readonly="true"/>
					</div>
				</div>
				<div>
					<label for="planned_service">Planned Service</label>
					<div>
						<form:input path="planned_service" readonly="true"/>
					</div>
				</div>
				<div>
					<label for="compled_issues">Completed Issues</label>
					<div>
						<form:input path="compled_issues" readonly="true"/>
					</div>
				</div>
				<div>
					<label for="total_sales_Amount">Total Sales Amount</label>
					<div>
						<form:input path="total_sales_Amount" readonly="true"/>
					</div>
				</div>
				<div>
					<label for="total_service_Amount">Total Service Amount</label>
					<div>
						<form:input path="total_service_Amount" readonly="true"/>
					</div>
				</div>
				<div>
					<label for="total_income">Total Income</label>
					<div>
						<form:input path="total_income" readonly="true"/>
					</div>
				</div>
			</form:form>
		</div>
	</div>
</body>
</html>