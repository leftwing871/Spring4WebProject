<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>사용자 관리 Main</h2>
	<form method="get" action="getUser.do">
		<label for="id">사용자ID :</label>
		<input type="text" id="id" name="userid"><br>
		<input type="submit"  value="조회">
	</form>
	<a href="getUserList.do">사용자 목록조회</a> <br>
	<a href="insertUserForm.do">사용자 등록</a>
</body>
</html>