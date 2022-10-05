package com.smhrd.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.smhrd.model.DAO;
import com.smhrd.model.WebMember;

@WebServlet("/JoinCon")
public class JoinCon extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// 1. post방식으로 보내왔기 때문에 한글 인코딩 잡아주기
		request.setCharacterEncoding("UTF-8");
		
		// 2. 요청받은 데이터 꺼내오기
		String email = request.getParameter("email");
		String pw = request.getParameter("pw");
		String tel = request.getParameter("tel");
		String address = request.getParameter("address");
		
		// 3. WebMember자료형 만들어서 위에 있는 데이터를 하나로 묶어주기
		WebMember vo = new WebMember();
		vo.setEmail(email);
		vo.setPw(pw);
		vo.setTel(tel);
		vo.setAddress(address);
		
		
		// 4. DAO를 생성해서 join이라는 메소드를 활용해
		//	  데이터베이스에 데이터를 집어넣기
		DAO dao = new DAO();
		
		int row = dao.join(vo);
		
		
		// 5. 성공했다면, join_success.jsp로 이동
		// 조건 - 회원가입 성공한 email값을 가지고 forward방식으로 이동!
		if(row > 0) {
			
			RequestDispatcher rd = request.getRequestDispatcher("join_success.jsp");
			
			request.setAttribute("email", email);
			
			rd.forward(request, response);
		}
		
	}

}
