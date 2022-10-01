<%@page import="java.net.URLEncoder"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>마우스정보</title>
</head>
<body>
	
	<p>마우스에 대한 상세 페이지입니다.</p>
	<p>모델명 : 로지텍 게이밍 마우스</p>
	<p>제품 가격: 21,900</p>
	
	
	<%--
		사용자가 상품의 상세 페이지에 들어왔을 때,
		제품명을 쿠키에 저장하기
		유효기간 3분
	 --%>
	 
	 <%
	 	String item = "로지텍 게이밍 마우스";
	 	String enc = URLEncoder.encode(item,"UTF-8");
	 	
	 	Cookie cookie = new Cookie("mouse_item", enc);
	 	cookie.setMaxAge(1*60*30);
	 	response.addCookie(cookie);
	 
	 //Cookie mouse = new Cookie("mouse_item", "마우스");
	 //response.addCookie(mouse);
	 
	 //Cookie second = new Cookie("mouse_item","");
	 //second.setMaxAge(180);

	 %>
	
	<a href="ex04list.jsp">제품 목록 페이지</a>
	

	
</body>
</html>