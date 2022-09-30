<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>include 지시자</title>
</head>
<body>

	<h3>취업강화과정 웹페이지</h3>
	<%@ include file="ex09Footer.jsp" %>
	<!-- include 지시자를 활용할때는 반드시 jsp확장자를 써줘야 한글 인코딩이 깨지지 않는다 -->
	<!-- 만약, 한글이 포함되어 있는 html을 include하고 싶다면 -->
	<!-- jsp action 태그를 활용해서 포함 시킬 것 -->
	<jsp:include page></jsp:include>
</body>
</html>