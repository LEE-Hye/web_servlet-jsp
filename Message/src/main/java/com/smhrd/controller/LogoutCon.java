package com.smhrd.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LogoutCon implements Command {
	
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// 1. session 가져오기
		HttpSession session = request.getSession();
		
		// 2. session 값 삭제하기
		session.invalidate();
		
		// 3. main.jsp로 이동
		RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/main.jsp");
		rd.forward(request, response);
	}

}
