<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Get All sales man</title>
</head>
<body style="background-color:#3d403d; color:white;">
	<div id="table root">
		<table>
			<thead>
				<tr style="width:100% , height:100%">
					<th>Sales Man Id</th>
					<th>Sales Man Name</th>
					<th>Contact</th>
					<th>Email</th>
					<th>Address</th>
					<th>profile</th>
					
				</tr>
			</thead>
			<tbody>
			<c:forEach var="salesman" items="${allsalesman}">
			   <tr>
			   	  <td>${salesman.seller_id}</td>
			   	  <td>${salesman.sel_name}</td>
			   	  <td>${salesman.sel_contact}</td>
			   	  <td>${salesman.sel_email}</td>
			   	  <td>${salesman.sel_address}</td>
			   	  <td>${salesman.sel_profile}</td>
			   </tr>
			</c:forEach>
			</tbody>
		</table>
	</div>
</body>
</html>