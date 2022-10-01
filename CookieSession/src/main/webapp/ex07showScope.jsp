<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>다른 페이지 내에서 scope</title>
</head>
<body>
	
	<%=pageContext.getAttribute("page")%> <br>
	<%=request.getAttribute("req")%> <br>
	<%=session.getAttribute("sess")%> <br>
	<%=application.getAttribute("app")%> <br>
	
</body>
</html>