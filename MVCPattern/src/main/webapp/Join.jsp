<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입 페이지</title>
</head>
<body>

	<h1>회원가입 페이지</h1>

	<form action="JoinProgram.jsp" method ="post">
	
		ID : <input type="text" name = "id">
		<br>
		PW : <input type="text" name = "pw">
		<br>
		NAME : <input type="text" name = "name">
		<br>
		AGE : <input type="text" name = "age">
		<br>
		<input type="submit" value="회원가입">
	</form>

</body>
</html>