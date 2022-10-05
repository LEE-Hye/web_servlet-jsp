package com.smhrd.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.smhrd.model.DAO;
import com.smhrd.model.WebMember;

@WebServlet("/LoginCon")
public class LoginCon extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// 1. post방식이니 한글 인코딩 잡아주기
		request.setCharacterEncoding("UTF-8");
		
		// 2. 데이터를 사용하기 위해서 main에서 form태그로 보내준 데이터 꺼내오기
		String email = request.getParameter("email");
		String pw = request.getParameter("pw");
		
		// 3. 로그인하는데 사용할 데이터를 하나로 묶어주기
		WebMember vo = new WebMember();
		vo.setEmail(email);
		vo.setPw(pw);
		
		// 4. 데이터베이스에서 데이터 조회하기
		DAO dao = new DAO();
		// select * from web_member where email=? and pw=?
		WebMember resultVO = dao.login(vo);
		
		// 흐름제어
		// 로그인 성공한 사용자 정보를 session에 담아서 main.jsp로 이동
		
			HttpSession session = request.getSession();	
			session.setAttribute("login", resultVO);
			
			response.sendRedirect("main.jsp");
	}

}
