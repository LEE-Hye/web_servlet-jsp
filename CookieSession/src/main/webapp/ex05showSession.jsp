<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>세션 확인</title>
</head>
<body>

	<h1>세션 확인</h1>
	
	<%
		// 세션에서 데이터 꺼내기
		// .getAttribute("name");
		// 세션에서 데이터를 꺼낼 때, Object타입으로 반환
		// 활용하기 위해서는 반드시 다운캐스팅 필요
		// (바꾸고 싶은 타입을 명시적으로 정확하게 형변환)
		String str = (String)session.getAttribute("str");
		ArrayList<String> list= (ArrayList<String>)session.getAttribute("list");
		
		out.print(str + "<br>");
		out.print(list);
		out.print("<br><br>");
	%>
	
	<a href="ex07UpdateSession">세션 수정, 삭제</a>

</body>
</html>