<%@page import="java.lang.ProcessBuilder.Redirect"%>
<%@page import="model.DAO"%>
<%@page import="model.AiMember"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Join Controller 역할</title>
</head>
<body>

	<h1>Join Controller 역할!</h1>
	
	<%
		// 1. (post로 보내와서 깨질 수 있으니) 한글 인코딩 잡아주기
		request.setCharacterEncoding("UTF-8");
	
		// 2. id값 꺼내오기
		String id = request.getParameter("id");
		
		// 3. 요청받은 값 전부 꺼내오기
		String pw = request.getParameter("pw");
		String name = request.getParameter("name");
		int age = Integer.parseInt(request.getParameter("age"));
		
		// 4. 데이터들을 사용자 정의 자료형(AiMember)으로 하나로 묶어주기
		AiMember vo = new AiMember(); // --> 객체 생성
		vo.setId(id); // --> setter 메소드 사용하여 데이터 바인딩
		vo.setPw(pw);
		vo.setName(name);
		vo.setAge(age);
		
		// 5. 데이터 베이스에 값을 추가하기
		DAO dao = new DAO();
		// 서로 다른 클래스 파일간의 값을 주고 받으려면 매개변수와 리턴 타입을 활용해야 한다.
		// JoinProgram.jsp --vo값을 전달--> DAO
		//					dao.join(vo)
		int result = dao.join(vo);
		
		// 6. 흐름 제어
		if(result > 0){
			// Main.jsp 이동
			response.sendRedirect("Main.jsp");
		}else{
			// Join.jsp 이동
			response.sendRedirect("Join.jsp");
		}
	
	%>
	
	

</body>
</html>