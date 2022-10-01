<%@page import="java.net.URLDecoder"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>쿠키 조회</title>
</head>
<body>

	<h1>쿠키 조회</h1>

	<%
		// 쿠키 > 요청에 담겨서 옴
		// request.getCookies();
		// 단, 모든 쿠키 꺼내짐 > Cookie배열 리턴(몇개든 배열 형태로 리턴)
		
		Cookie[] cookies =  request.getCookies();
		
		//for(int i = 0; i <cookies.length; i++){
		//	Cookie c = cookies[i];
		//}
		
		// for each
		for(Cookie c : cookies){
			
			// 쿠키의 이름가져오기
			String name = c.getName();
			
			if(name.contains("_item")){
				
				// 저장된 데이터 가져오기
				String value = c.getValue();
				// URLDecoder.decode("대상", "인코딩방식");
				String dec = URLDecoder.decode(value, "UTF-8");
			
				out.print("<p>" + name + ":" + dec + "</p>");
			}
		}
			
	%>
	
	<!-- 확장자를 붙여주지 않아 서블릿으로 감 -->
	<a href="ex03UpdateCookie">쿠키 수정, 삭제</a>
	
</body>
</html>