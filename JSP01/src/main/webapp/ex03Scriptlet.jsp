<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>스크립트릿과 표현식</title>
</head>
<body>
	<!-- 1. 스크립트릿 -->
	<%
		// java 코드를 쓸 수 있는 공간
		int num1 = 4;
		int num2 = 7;
		int sum = num1 + num2;
	%>
	
	<!-- 2. 표현식 -->
	<!-- : 스크립트릿을 활용해서 생성한 변수, 결과값들은 반드시 표현식을 활용해야 
		   웹 페이지 안에 출력된다.
		 : 표현식 안족에는 ;을 사용하지 않는다. 
		 -->
	<%= sum %>
	<%= Math.abs(-1)%>


</body>
</html>