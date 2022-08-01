<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>All Expenditure</title>
</head>
<body style="background-color:#3d403d; color:white;">
	<div id="table root">
		<table>
			<thead>
				<tr style="width:100% , height:100%">
					<th>Expenditure Id</th>
					<th>Expenditure From Date</th>
					<th>Expenditure To Date</th>
					<th>Spends For Material</th>
					<th>Spends For Marketing</th>
					<th>Spends For Employee Salary</th>
					<th>Spends For Electric Bill</th>
					<th>Spends For Cleaning</th>
					<th>Other Expenditure</th>
					<th>Total Expenditure</th>
					
				</tr>
			</thead>
			<tbody>
			<c:forEach var="allexp" items="${allexp}">
			   <tr>
			   	  <td>${allexp.expenditure_id}</td>
			   	  <td>${allexp.expenditure_from_date}</td>
			   	  <td>${allexp.expenditure_to_date}</td>
			   	  <td>${allexp.spends_for_materials}</td>
			   	  <td>${allexp.spend_for_marketing}</td>
			   	  <td>${allexp.spends_for_emp_salary}</td>
			   	  <td>${allexp.spends_for_electric_bill}</td>
			   	  <td>${allexp.spends_for_cleaning}</td>
			   	  <td>${allexp.other_expenditure}</td>
			   	  <td>${allexp.total_expenditure}</td>
			   </tr>
			</c:forEach>
			</tbody>
		</table>
	</div>
	</body>
</html>