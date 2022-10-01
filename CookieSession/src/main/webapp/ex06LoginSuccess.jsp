<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>세션 이용 로그인</title>
</head>
<body>

	<%
		// id수집
		String id = (String)session.getAttribute("id");
	%>
	<fieldset>
		<h2><%=id %>님 환영합니다</h2>
		<a href="ex06Logout.jsp">로그아웃</a>
	</fieldset>
</body>
</html>