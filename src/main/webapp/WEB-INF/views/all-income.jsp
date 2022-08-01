<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>All Income</title>
</head>
<body style="background-color:#3d403d; color:white;">
	<div id="table root">
		<table>
			<thead>
				<tr style="width:100% , height:100%">
					<th>Income Id</th>
					<th>Income From Date</th>
					<th>Income To Date</th>
					<th>Planned Leads</th>
					<th>Commited Leads</th>
					<th>Planned Sales</th>
					<th>Closed Sales</th>
					<th>Planned Service</th>
					<th>Completed Issues</th>
					<th>Total Sales Amount</th>
					<th>Total Service Amount</th>
					<th>Total Income</th>
				</tr>
			</thead>
			<tbody>
			<c:forEach var="allincome" items="${allincome}">
			   <tr>
			   	  <td>${allincome.income_id}</td>
			   	  <td>${allincome.income_from_date}</td>
			   	  <td>${allincome.income_to_date}</td>
			   	  <td>${allincome.planned_leads}</td>
			   	  <td>${allincome.commited_leads}</td>
			   	  <td>${allincome.planned_sales}</td>
			   	  <td>${allincome.closed_sales}</td>
			   	  <td>${allincome.planned_service}</td>
			   	  <td>${allincome.compled_issues}</td>
			   	  <td>${allincome.total_sales_Amount}</td>
			   	  <td>${allincome.total_service_Amount}</td>
			   	  <td>${allincome.total_income}</td>
			   </tr>
			</c:forEach>
			</tbody>
		</table>
	</div>
	</body>
</html>