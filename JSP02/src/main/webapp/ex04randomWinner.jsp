<%@page import="java.util.Random"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>랜덤당첨결과</title>
</head>
<body>
	
	<%
		// 1. 한글 인코딩 잡아주기
		request.setCharacterEncoding("UTF-8");
	
		// 2. 데이터 꺼내오기(title, item --> 여러개)
		String title = request.getParameter("title");
		String[] item = request.getParameterValues("item");
		
		// 3. 랜덤 도구 생성하기
		Random ran = new Random();
		
		// 4. 랜덤값 뽑아오기
		int su = ran.nextInt(item.length);
		String result = item[su];
	%>
	
	<fieldset align="center">
	<legend>랜덤당첨결과</legend>
		<table align="center">
			<tr>
			<td><%=title %></td>
			</tr>
			<tr>
			<td><%=result %></td>
			</tr>
		</table>
	</fieldset>
</body>
</html>