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
		// id,pw 파라미터 수집
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
	
		// id가 smart이고, pw가 123인지 검사
		if(id.equals("smart") && pw.equals("123")){
			response.sendRedirect("ex06LoginSuccess.jsp?id="+id);
		}else{
			response.sendRedirect("ex06LoginFail.jsp");
		}
	%>
</body>
</html>