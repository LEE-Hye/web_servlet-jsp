package com.smhrd.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.smhrd.model.DAO;
import com.smhrd.model.WebMember;

public class selectCon implements Command {

	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// 1. DAO 생성
		DAO dao = new DAO();
		
		// 2. DAO에서 selectAll 메소드 생성
		// ---> database에서 email이 admin이 아닌 사용자에 대한 모든 정보를 조회
		// select * from web_member where email !='admin'
		List<WebMember> list = dao.selectAll();
		// WebMember : 한 사람에 대한 정보만 담을 수 있는 형태
		// WebMember[] ---> 배열은 크기가 고정적이기 때문에 개수를 지정해야 함
		// 가변적인 형태가 필요하다 ---> ArrayList Collection자료구조
		// ArrayList의 상위버전(부모클래스 ver) List 사용
		
		// 3. requset영역에 조회한 데이터 담기
		request.setAttribute("list", list);
		
		// 4. select.jsp로 forward방식으로 이동
		RequestDispatcher rd = request.getRequestDispatcher("select.jsp");
		rd.forward(request, response);
	}

}
