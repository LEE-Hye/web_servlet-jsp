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
		String url = request.getParameter("url");
	
		if(url.equals("Naver")){
			// 페이지 이동(응답 되돌려주기!)
			response.sendRedirect("https://www.naver.com");
		}else if(url.equals("Google")){
			response.sendRedirect("https://www.google.com");
		}else{
			response.sendRedirect("https://www.daum.net");
		}
	%>
	
</body>
</html>