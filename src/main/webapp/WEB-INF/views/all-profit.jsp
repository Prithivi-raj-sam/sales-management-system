<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
        <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>All Profit</title>
</head>
<body style="background-color:#3d403d; color:white;">
	<div id="table root">
		<table>
			<thead>
				<tr style="width:100% , height:100%">
					<th>Profit Id</th>
					<th>Income Id</th>
					<th>Expenditure Id</th>
					<th>Profit Amount</th>
				</tr>
			</thead>
			<tbody>
			<c:forEach var="allprofit" items="${allprofit}">
			   <tr>
			   	  <td>${allprofit.profit_id}</td>
			   	  <td>${allprofit.income_id}</td>
			   	  <td>${allprofit.expenditure_id}</td>
			   	  <td>${allprofit.profit_Amount}</td>
			   	 
			   </tr>
			</c:forEach>
			</tbody>
		</table>
	</div>
	</body>
</html>