<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>방이 10개인 table</title>
</head>
<body>
	<!-- 스크립트릿 끊어서도 가능 -->
	<table border="1px">
		<tr bgcolor="gray">
	<%
		for(int i = 1; i < 11; i++){
	%>
			<td><%=i %></td>
	<%			
		}
	 %>
	 		</tr>
	</table>
</body>
</html>