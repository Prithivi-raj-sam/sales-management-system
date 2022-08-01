<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>update Expenditure</title>
</head>
<body style="background-color:#3d403d; color:white;">
	<div id="root">
		<div id="form">
			<form:form action="updateexp" method="post" modelAttribute="updateexp">
				<div>
					<label for="expenditure_id">Expenditure id</label>
					<div>
						<form:input path="expenditure_id" />
					</div>
				</div>
				<div>
					<label for="expenditure_from_date">Expenditure From Date</label>
					<div>
						<form:input path="expenditure_from_date" />
					</div>
				</div>
				<div>
					<label for="expenditure_to_date">Expenditure To Date</label>
					<div>
						<form:input path="expenditure_to_date" />
					</div>
				</div>
				<div>
					<label for="spends_for_materials">Spends For Materials</label>
					<div>
						<form:input path="spends_for_materials" />
					</div>
				</div>
				<div>
					<label for="spend_for_marketing">Spends For Marketing</label>
					<div>
						<form:input path="spend_for_marketing" />
					</div>
				</div>
				<div>
					<label for="spends_for_emp_salary">Spends For Employee Salary</label>
					<div>
						<form:input path="spends_for_emp_salary" />
					</div>
				</div>
				<div>
					<label for="spends_for_electric_bill">Spends For electric bill</label>
					<div>
						<form:input path="spends_for_electric_bill" />
					</div>
				</div>
				<div>
					<label for="spends_for_cleaning">Spends For Cleaning</label>
					<div>
						<form:input path="spends_for_cleaning" />
					</div>
				</div>
				<div>
					<label for="other_expenditure">Other Expenditure</label>
					<div>
						<form:input path="other_expenditure" />
					</div>
				</div>
				<div>
					<label for="total_expenditure">Total Expenditure</label>
					<div>
						<form:input path="total_expenditure" />
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
		document.getElementById("div1").innerHTML="1 Expenditure updated";
	}
	</script>
</body>
</html>