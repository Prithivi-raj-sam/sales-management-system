<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>All sales</title>
</head>
<body style="background-color:#3d403d; color:white;">
	<div id="table root">
		<table>
			<thead>
				<tr style="width:100% , height:100%">
					<th>Account Id</th>
					<th>Account Name</th>
					<th>Company</th>
					<th>Role</th>
					<th>Email</th>
					<th>Contact</th>
					<th>Address</th>
					<th>Account Type</th>
				</tr>
			</thead>
			<tbody>
			<c:forEach var="allsale" items="${allsale}">
			   <tr>
			   	  <td>${allsale.sale_id}</td>
			   	  <td>${allsale.account_id}</td>
			   	  <td>${allsale.seller_id}</td>
			   	  <td>${allsale.stages}</td>
			   	  <td>${allsale.close_date}</td>
			   	  <td>${allsale.amount}</td>
			   	  <td>${allsale.status}</td>
			   </tr>
			</c:forEach>
			</tbody>
		</table>
	</div>
	</body>
</html>