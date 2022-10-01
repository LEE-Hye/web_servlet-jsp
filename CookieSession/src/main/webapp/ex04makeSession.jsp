<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>세션 값 저장</title>
</head>
<body>
	
	<h1>세션에 값 저장하기</h1>
	
	<%
		// 세션 받아오기
		// HttpSession session = request.getSession(); ->  생략 가능
		// JSP 한정으로, session 받아오는 과정을 생략 가능 : 내장객체
	
		String value = "스마트 인재 개발원";
	
		// 세션에 데이터 저장하기
		// setAttribute("name", Object타입의 value);
		session.setAttribute("str", value);
	
		ArrayList<String> list = new ArrayList<String>();
		list.add("배준오");
		list.add("변민주");
		list.add("윤채원");
		list.add("신세화");
		list.add("김서은");
	
		// session은 Object 타입으로 업캐스팅 저장
		// 따라서 모든 자바 객체 저장 가능
		session.setAttribute("list", list);
	
	%>
	
	<a href = "ex06showSession.jsp">세션 확인</a>
	
</body>
</html>