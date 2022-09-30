<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
	
		if(id.equals("smart") && pw.equals("123")){
			response.sendRedirect("ex06LoginSuccess.jsp");
		}else{
			response.sendRedirect("ex06LoginFail.jsp");
		}
	%>
</body>
</html>