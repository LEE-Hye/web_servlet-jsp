<%@page import="java.net.URLEncoder"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>쿠키 생성</title>
</head>
<body>
	
	<h1>쿠키 생성하기</h1>
	
	<%
		// Cookie : 사용자의 정보를 유지하기 위한 기술
		// Client(사용자)의 PC에 파일 형태로 저장
		// 응답할 때, 쿠키를 실어 보내고 요청에 자동으로 담겨서 전달된다.
		
		// 쿠키 생성
		// new Cookie("쿠키의 이름","저장할 값");
		Cookie first = new Cookie("first_item","첫번째쿠키");
		
		// Cookie는 Text데이터만 저장
		// Cookie는 공백, 특수 기호 저장 불가능
		// --> URL 방식으로 인코딩 필요 > URLEncoder 사용
		// URLEncoder.encode("대상", "인코딩 방식");
		String enc = URLEncoder.encode("두번째 쿠키", "UTF-8");
		Cookie second = new Cookie("second_item", enc);
		
		// 응답에 쿠키 추가하기
		// addCookie(만든 쿠키);
		response.addCookie(first);
		response.addCookie(second);
		
	%>
	
	<a href="ex02showCookie.jsp">쿠키조회</a>
	
</body>
</html>