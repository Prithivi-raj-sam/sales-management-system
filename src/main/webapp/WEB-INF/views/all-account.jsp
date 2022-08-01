<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>All Account Details</title>
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
			<c:forEach var="allacc" items="${allaccount}">
			   <tr>
			   	  <td>${allacc.account_id}</td>
			   	  <td>${allacc.account_name}</td>
			   	  <td>${allacc.company}</td>
			   	  <td>${allacc.tittle}</td>
			   	  <td>${allacc.email}</td>
			   	  <td>${allacc.contact}</td>
			   	  <td>${allacc.address}</td>
			   	  <td>${allacc.account_type}</td>
			   </tr>
			</c:forEach>
			</tbody>
		</table>
	</div>
	</body>
</html>