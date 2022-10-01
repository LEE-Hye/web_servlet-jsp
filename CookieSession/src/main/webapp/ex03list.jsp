<%@page import="java.net.URLDecoder"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>판매제품목록</title>
</head>
<body>
	
	<h1>판매제품목록</h1>
	
	<ul>
		<li><a href="ex04mouse.jsp">마우스</a></li>
		<li><a href="ex04phone.jsp">갤럭시 노트10</a></li>
		<li><a href="ex04computer.jsp">사무용 PC</a></li>
	</ul>
	
	<hr>
	
	<h3>최근 본 상품</h3>
	<%--
		상품 이름이 저장된 cookie의 value들만 출력
	--%>
	
	<%
		Cookie[] cookies = request.getCookies();
	
	if(cookies != null){ // 쿠키가 전혀 없을 때 오류뜨는데 이거 해주면 괜찮음
		
		for(Cookie c : cookies){
			String name = c.getName();
			
			if(name.contains("_item")){
				
				String value = c.getValue();
				String dec = URLDecoder.decode(value, "UTF-8");
				
				out.print("<p>" + dec + "</p>");
			}
		}
	}
	%>
	
	<a href="ex04delete">최근 본 목록 삭제하기</a>
	
</body>
</html>