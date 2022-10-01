<%@page import="java.net.URLEncoder"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>PC정보</title>
</head>
<body>

	<p>사무용 PC에 대한 상세페이지입니다.</p>
	<p>모델명: 사무용 PC</p>
	<p>제품 가격: 159,000</p>
	
	 <%
	 	String item = "사무용 PC";
	 	String enc = URLEncoder.encode(item,"UTF-8");
	 	
	 	Cookie cookie = new Cookie("com_item", enc);
	 	cookie.setMaxAge(1*60*30);
	 	response.addCookie(cookie);

	 %>
	
	<a href="ex04list.jsp">제품 목록 페이지</a>

</body>
</html>