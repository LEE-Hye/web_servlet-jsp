<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인 성공</title>
</head>
<body>
	
	<h1>로그인 성공!</h1>
	
	<h3>
		<!-- 
			session에서 값을 꺼내오면 return은 Object 형식이다.
			다운 캐스팅 필수!
		 -->
		<%=(String)session.getAttribute("name") %>님 환영합니다.
	</h3>
	
	<button onclick="location.href='LogoutCon'">로그아웃</button>
	
	<button onclick="location.href='Main.jsp'">main으로 돌아가기</button>
	
</body>
</html>