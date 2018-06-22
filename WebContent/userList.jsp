<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>사용자 리스트</h2>
	<table>
		<tr>
			<th>ID</th><th>Name</th><th>Gender</th><th>City</th>
		</tr>
		<c:forEach var="user" items="${userListKey}">
			<tr>
				<td>${user.userId}</td>
				<td>${user.name}</td>
				<td>${user.gender}</td>
				<td>${user.city}</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>