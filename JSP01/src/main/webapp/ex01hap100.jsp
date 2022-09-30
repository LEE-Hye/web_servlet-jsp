<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>100까지의 합</title>
</head>
<body>

	<%
		int result = 0;
		for(int i = 1; i < 101; i++){
			result += i;
		}
	%>

	<h1>1~100까지의 합 : <%=result %></h1>
	
	<%-- 스크립트릿 주석 --%>
</body>
</html>