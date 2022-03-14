<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" session="true"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<table>
		<c:forEach var="e" items="${Emp}">
			<tr>
				<td><c:out value="${e.empId}" /></td>
				<td><c:out value="${e.name}" /></td>
				<td><c:out value="${e.city}" /></td>
				<td><c:out value="${e.salary}" /></td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>