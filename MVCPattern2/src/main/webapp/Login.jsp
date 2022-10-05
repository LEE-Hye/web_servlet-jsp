<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인 페이지</title>
</head>
<body>
	<h3>로그인 페이지</h3>
	<form action="LoginCon" method="post">
	
	
	<% 
		// 1. request영역에 저장된 id값 가져오기
		// setAttribute로 보내줬기 때문에 getAttribute로 받아준다.
		// 값 가져올 땐 다운 캐스팅
		String id = (String)request.getAttribute("id");
	
		// 2. 조건 판단
		if(id != null){
			
	
	%>
		ID : <input type="text" name = "id" value="<%=id%>">
		<br>
	<%}else{ %>
		ID : <input type="text" name = "id">
		<br>
	<%} %>
	
	
	PW : <input type="text" name = "pw">
	<br>
	<input type="submit" value="로그인">
	</form>
</body>
</html>