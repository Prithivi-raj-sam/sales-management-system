<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>All Marketing Man</title>
</head>
<body style="background-color:#3d403d; color:white;">
	<div id="table root">
		<table>
			<thead>
				<tr style="width:100% , height:100%">
					<th>Marketing Man Id</th>
					<th>Name</th>
					<th>Contact</th>
					<th>Email</th>
					<th>Address</th>
					<th>Profile</th>
				</tr>
			</thead>
			<tbody>
			<c:forEach var="allmark" items="${allmark}">
			   <tr>
			   	  <td>${allmark.marketer_id}</td>
			   	  <td>${allmark.m_name}</td>
			   	  <td>${allmark.m_contact}</td>
			   	  <td>${allmark.m_email}</td>
			   	  <td>${allmark.m_address}</td>
			   	  <td>${allmark.m_profile}</td>
			   </tr>
			</c:forEach>
			</tbody>
		</table>
	</div>
	</body>
</html>