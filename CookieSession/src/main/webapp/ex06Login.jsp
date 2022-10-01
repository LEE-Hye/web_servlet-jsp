<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>세션 이용 로그인</title>
</head>
<body>
	<%
		// id,pw 파라미터 수집
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
	
		// id가 smart이고, pw가 123인지 검사
		if(id.equals("smart") && pw.equals("123")){
			// session에 아이디를 저장했다가 LoginSuccess에서 꺼내서 출력시키기
			session.setAttribute("id", id);
			response.sendRedirect("ex06LoginSuccess.jsp");
		}else{
			response.sendRedirect("ex06LoginFail.jsp");
		}
	%>
</body>
</html>