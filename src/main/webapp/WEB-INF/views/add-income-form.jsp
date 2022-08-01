<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>add Income</title>
</head>
<body style="background-color:#3d403d; color:white;">
	<div id="root">
		<div id="form">
			<form:form action="addincome" method="post" modelAttribute="addincome">
				<div>
					<label for="income_id">Income id</label>
					<div>
						<form:input path="income_id" />
					</div>
				</div>
				<div>
					<label for="income_from_date">Income From Date</label>
					<div>
						<form:input path="income_from_date" />
					</div>
				</div>
				<div>
					<label for="income_to_date">Income To Date</label>
					<div>
						<form:input path="income_to_date" />
					</div>
				</div>
				<div>
					<label for="planned_leads">Planned Leads</label>
					<div>
						<form:input path="planned_leads" />
					</div>
				</div>
				<div>
					<label for="commited_leads">Committed Leads</label>
					<div>
						<form:input path="commited_leads" />
					</div>
				</div>
				<div>
					<label for="planned_sales">Planned Sales</label>
					<div>
						<form:input path="planned_sales" />
					</div>
				</div>
				<div>
					<label for="closed_sales">Closed Sales</label>
					<div>
						<form:input path="closed_sales" />
					</div>
				</div>
				<div>
					<label for="planned_service">Planned Service</label>
					<div>
						<form:input path="planned_service" />
					</div>
				</div>
				<div>
					<label for="compled_issues">Completed Issues</label>
					<div>
						<form:input path="compled_issues" />
					</div>
				</div>
				<div>
					<label for="total_sales_Amount">Total Sales Amount</label>
					<div>
						<form:input path="total_sales_Amount" />
					</div>
				</div>
				<div>
					<label for="total_service_Amount">Total Service Amount</label>
					<div>
						<form:input path="total_service_Amount" />
					</div>
				</div>
				<div>
					<label for="total_income">Total Income</label>
					<div>
						<form:input path="total_income" />
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
		document.getElementById("div1").innerHTML="1 Income Added";
	}
	</script>
</body>
</html>