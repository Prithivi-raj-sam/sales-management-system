<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
      <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>get Expenditure By Id</title>
</head>
<body style="background-color:#3d403d; color:white;">
	<div id="root">
		<div id="form">
			<form:form action="" method="post" modelAttribute="exp">
				<div>
					<label for="expenditure_id">Expenditure id</label>
					<div>
						<form:input path="expenditure_id" readonly="true"/>
					</div>
				</div>
				<div>
					<label for="expenditure_from_date">Expenditure From Date</label>
					<div>
						<form:input path="expenditure_from_date" readonly="true"/>
					</div>
				</div>
				<div>
					<label for="expenditure_to_date">Expenditure To Date</label>
					<div>
						<form:input path="expenditure_to_date" readonly="true"/>
					</div>
				</div>
				<div>
					<label for="spends_for_materials">Spends For Materials</label>
					<div>
						<form:input path="spends_for_materials" readonly="true"/>
					</div>
				</div>
				<div>
					<label for="spend_for_marketing">Spends For Marketing</label>
					<div>
						<form:input path="spend_for_marketing" readonly="true"/>
					</div>
				</div>
				<div>
					<label for="spends_for_emp_salary">Spends For Employee Salary</label>
					<div>
						<form:input path="spends_for_emp_salary" readonly="true"/>
					</div>
				</div>
				<div>
					<label for="spends_for_electric_bill">Spends For electric bill</label>
					<div>
						<form:input path="spends_for_electric_bill" readonly="true"/>
					</div>
				</div>
				<div>
					<label for="spends_for_cleaning">Spends For Cleaning</label>
					<div>
						<form:input path="spends_for_cleaning" readonly="true"/>
					</div>
				</div>
				<div>
					<label for="other_expenditure">Other Expenditure</label>
					<div>
						<form:input path="other_expenditure" readonly="true"/>
					</div>
				</div>
				<div>
					<label for="total_expenditure">Total Expenditure</label>
					<div>
						<form:input path="total_expenditure" readonly="true"/>
					</div>
				</div>
				
			</form:form>
		</div>
	</div>
</body>
</html>