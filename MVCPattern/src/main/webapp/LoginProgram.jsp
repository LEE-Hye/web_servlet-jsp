<%@page import="model.DAO"%>
<%@page import="model.AiMember"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login Controller 역할</title>
</head>
<body>
	
	<h3>Login Controller 역할!</h3>
	
	<%
		// 1. 한글 인코딩 잡아주기
		request.setCharacterEncoding("UTF-8");
	
		// 2. Login.jsp로 요청받은 값 꺼내오기
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		
		// 3. 데이터 하나로 묶어주기
		AiMember vo = new AiMember();
		vo.setId(id);
		vo.setPw(pw);
		
		// 4. 데이터베이스에 해당하는 id와 pw가 일치하는 데이터가 있는지 조회
		// select * from aimember where id = ? and pw = ?
		DAO dao = new DAO(); // ---> 데이터베이스 접근을 위한 도구
		
		// 도구 사용
		AiMember resultVo = dao.login(vo);
		
		// 5. 결과값에 따라서 흐름 제어
		if(resultVo != null){
			
			// 6. 사용자 정보를 session 객체 바인딩
			session.setAttribute("name", resultVo.getName());
			
			response.sendRedirect("LoginSuccess.jsp");
		}else{
			response.sendRedirect("LoginFail.jsp");
		}
				
	%>
	
</body>
</html>