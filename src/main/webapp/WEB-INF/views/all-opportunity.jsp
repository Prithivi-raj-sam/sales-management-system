<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body style="background-color:#3d403d; color:white;">
	<div id="table root">
		<table>
			<thead>
				<tr style="width:100% , height:100%">
					<th>Opportunity Id</th>
					<th>Account Id</th>
					<th>Marketer Id</th>
					<th>Stages</th>
					<th>Amount</th>
					<th>Fiscal Period</th>
					<th>Probability</th>
				</tr>
			</thead>
			<tbody>
			<c:forEach var="allopp" items="${allopp}">
			   <tr>
			   	  <td>${allopp.opp_id}</td>
			   	  <td>${allopp.account_id}</td>
			   	  <td>${allopp.marketer_id}</td>
			   	  <td>${allopp.stages}</td>
			   	  <td>${allopp.amount}</td>
			   	  <td>${allopp.fiscal_period}</td>
			   	  <td>${allopp.propability}</td>
			   </tr>
			</c:forEach>
			</tbody>
		</table>
	</div>
	</body>
</html>