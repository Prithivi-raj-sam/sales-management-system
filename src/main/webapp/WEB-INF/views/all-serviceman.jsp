<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>All ServiceMan</title>
</head>
<body style="background-color:#3d403d; color:white;">
	<div id="table root">
		<table>
			<thead>
				<tr style="width:100% , height:100%">
					<th>Service Man Id</th>
					<th>Name</th>
					<th>Contact</th>
					<th>Email</th>
					<th>Address</th>
					<th>Profile</th>
				</tr>
			</thead>
			<tbody>
			<c:forEach var="allservman" items="${allservman}">
			   <tr>
			   	  <td>${allservman.servicer_id}</td>
			   	  <td>${allservman.ser_name}</td>
			   	  <td>${allservman.ser_contact}</td>
			   	  <td>${allservman.ser_email}</td>
			   	  <td>${allservman.ser_address}</td>
			   	  <td>${allservman.ser_profile}</td>
			   </tr>
			</c:forEach>
			</tbody>
		</table>
	</div>
	</body>
</html>