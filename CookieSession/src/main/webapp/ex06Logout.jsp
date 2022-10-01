<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>세션 이용 로그아웃</title>
</head>
<body>
	<%
	
		// session에서 사용자 정보 삭제
		session.removeAttribute("id");
		
		// ex06login.html로 이동
		response.sendRedirect("ex06Login.html");
	%>
</body>
</html>