<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Get All Admin</title>
</head>
<body style="background-color:#3d403d; color:white;">
	<div id="table root">
		<table>
			<thead>
				<tr style="width:100% , height:100%">
					<th>Admin Id</th>
					<th>Admin Name</th>
					<th>Password</th>
					
				</tr>
			</thead>
			<tbody>
			<c:forEach var="alladmin" items="${alladmin}">
			   <tr>
			   	  <td>${alladmin.admin_id}</td>
			   	  <td>${alladmin.admin_name}</td>
			   	  <td>${alladmin.admin_password}</td>
			   </tr>
			</c:forEach>
			</tbody>
		</table>
	</div>
	</body>
</html>