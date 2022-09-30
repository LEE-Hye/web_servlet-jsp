<%@page import="java.util.Random"%>
<%@page import="java.util.ArrayList"%>
<!-- 4. 지시자 : jsp 환경설정하는 값 담는다. -->
<!-- 페이지 환경설정뿐만 아니라, 객체를 import 하는 역할도 수행한다. -->
<!-- page지시자, taglib지시자, include지시자 -->
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>지시자</title>
</head>
<body align="center">
	
	<%
		ArrayList<String> list = new ArrayList<String>();
		Random ran = new Random();
	%>
	
	<img src="img/error.jfif">
	<h2>죄송합니다. 서비스 확인중입니다.</h2>
	
</body>
</html>