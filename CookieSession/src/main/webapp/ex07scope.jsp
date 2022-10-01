<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>한 페이지 내에서 scope</title>
</head>
<body>
	
	<h1>JSP 내장 객체 영역에 데이터 저장하기</h1>
	
	<%
		// page scope : 하나의 JSP페이지 안에서만 사용 가능
		// 변수명 : pageContext(나 페이지 영역 쓸거야)
		pageContext.setAttribute("page", "pageContext");
	
		// request scope : 한 번의 요청-응답 동안에만 사용 가능
		// 변수명 : request
		request.setAttribute("req", "requset");
		
		// session scope : 하나의 브라우저 내에서만 사용 가능
		// 변수명 : session
		session.setAttribute("sess", "session");
		
		// application scope : 톰캣서버 실행중인 동안 어디서나 사용 가능
		// 변수명 : application
		application.setAttribute("app", "application");
	%>
	
	<%=pageContext.getAttribute("page")%> <br>
	<%=request.getAttribute("req")%> <br>
	<%=session.getAttribute("sess")%> <br>
	<%=application.getAttribute("app")%> <br>
	
	<%-- response.sendRedirect("ex07showScope.jsp"); --%>
	<% 
		// redirect 방식 : 요청/응답 각각 한 번씩 총 2번 걸림 > request영역이 초기화
		// 외부 서버로도 요청이 가능
		
		// forward 방식 : 요청/응답 1번 만에 둘 다 함 > request 유지 가능
		// 프로젝트 내에서만 이동이 가능(서버 밖으로는 못나감)
		// RequsetDispatcher 객체 생성
		// request.getRequestDispatcher("이동할 페이지 경로");
		RequestDispatcher rd = request.getRequestDispatcher("ex07showScope.jsp");
		rd.forward(request, response);
	%>
	<a href = "ex07showScope.jsp">scope 확인</a>
</body>
</html>