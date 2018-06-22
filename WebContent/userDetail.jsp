<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>사용자 상세정보</h2>
	<ul>
		<li>UserId : ${userKey.userId}</li>
		<li>Name : ${userKey.name}</li>
		<li>Gender : ${userKey.gender}</li>
		<li>City : ${userKey.city}</li>
	</ul>
</body>
</html>