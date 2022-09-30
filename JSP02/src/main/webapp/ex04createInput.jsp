<%@page import="java.util.Random"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>랜덤숫자입력</title>
</head>
<body>
<!-- html 파일에서부터 데이터를 받아오기 -- 그 개수만큼 input 태그 생성 -->
	<%
		int num = Integer.parseInt(request.getParameter("num"));
	%>
	
	<fieldset align="center">
	<legend>랜덤숫자입력</legend>
	<form action="ex04randomWinner.jsp">
		<table align="center">
			<tr>
			<td>주제</td>
			<td> <input type="text" name="title"> </td>
			</tr>
			<% for(int i = 0; i < num; i++){%>
				<tr>
				<td>아이템 <%=(i+1)%> :</td>
				<td><input type="text" name="item"></td>
				</tr>
			<%}%>
		</table>
		<input type="submit" value="시작">
	</form>
	</fieldset>
</body>
</html>