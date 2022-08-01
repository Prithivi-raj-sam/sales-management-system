<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Get All Service</title>
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
			<c:forEach var="allserv" items="${allserv}">
			   <tr>
			   	  <td>${allserv.service_id}</td>
			   	  <td>${allserv.ser_id}</td>
			   	  <td>${allserv.sevice_date}</td>
			   	  <td>${allserv.account_id}</td>
			   	  <td>${allserv.issues}</td>
			   	  <td>${allserv.status}</td>
			   	  <td>${allserv.proirity}</td>
			   	  <td>${allserv.channel}</td>
			   </tr>
			</c:forEach>
			</tbody>
		</table>
	</div>
	</body>
</html>