<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>All-Territories</title>
</head>
<body style="background-color:#3d403d; color:white;">
	<div id="table root">
		<table>
			<thead>
				<tr style="width:100% , height:100%">
					<th>Territory Id</th>
					<th>Territory Name</th>
					<th>No Of Customer</th>
				</tr>
			</thead>
			<tbody>
			<c:forEach var="allter" items="${allter}">
			   <tr>
			   	  <td>${allter.territory_id}</td>
			   	  <td>${allter.territory_name}</td>
			   	  <td>${allter.no_of_customers}</td>
			   </tr>
			</c:forEach>
			</tbody>
		</table>
	</div>
	</body>
</html>