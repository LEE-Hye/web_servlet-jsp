<%@page import="java.net.URLEncoder"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>폰정보</title>
</head>
<body>

	<p>갤럭시 노트10+ 5G에 대한 상세 페이지입니다.</p>
	<p>모델명 : 갤럭시 노트10+ 5G</p>
	<p>제품 가격: 1,397,000원</p>
	
	<%
		String item = "갤럭시 노트 10+ 5G";
 		String enc = URLEncoder.encode(item,"UTF-8");
 	
	 	Cookie cookie = new Cookie("phone_item", enc);
 		cookie.setMaxAge(1*60*30);
 		response.addCookie(cookie);

	%>
	
	<a href="ex04list.jsp">제품 목록 페이지</a>

</body>
</html>