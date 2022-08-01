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
					<th>Lead Id</th>
					<th>Account Id</th>
					<th>Marketer Id</th>
					<th>Channel</th>
					<th>Status</th>
					
				</tr>
			</thead>
			<tbody>
			<c:forEach var="addlead" items="${addlead}">
			   <tr>
			   	  <td>${addlead.leed_id}</td>
			   	  <td>${addlead.account_id}</td>
			   	  <td>${addlead.marketer_id}</td>
			   	  <td>${addlead.channel}</td>
			   	  <td>${addlead.status}</td>
			   	 
			   </tr>
			</c:forEach>
			</tbody>
		</table>
	</div>
	</body>
</html>