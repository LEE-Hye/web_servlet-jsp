package com.smhrd.frontcontroller;

import java.io.IOException;
import java.util.HashMap;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.smhrd.controller.Command;
import com.smhrd.controller.JoinCon;
import com.smhrd.controller.LoginCon;
import com.smhrd.controller.LogoutCon;
import com.smhrd.controller.selectCon;

// --> url pattern이 .do로 끝나는 모든 요청 url을 처리하겠다.
@WebServlet("*.do")
public class FrontController extends HttpServlet {
	// 흐름 정리를 하는 역할
	// 사용자 요청 ---> LoginCon 요청 url ---> LoginCon.execute 실행

	private static final long serialVersionUID = 1L;
	private HashMap<String, Command> map = null;
	// <키 값, value 형(con = new JoinCon();얘네가 커맨드 형이라 할 수 있음)>
	

	@Override
	public void init(ServletConfig config) throws ServletException {

		// 1. map을 생성
		// <> 안 적어도 됨
		map = new HashMap<String, Command>();
		
		// 2. map안에 데이터 추가
		map.put("JoinCon.do", new JoinCon());
		map.put("LoginCon.do", new LoginCon());
		map.put("LogoutCon.do", new LogoutCon());
		map.put("selectCon.do", new selectCon());
	}
	
	

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// 요청 url을 구분!!
		// http://localhost:8090/Message/LoginCon.do
		// ---> LoginCon.do 파트만 url 떼오는 작업 필요함!
		
		String uri = request.getRequestURI();
		// uri == /Message/LoginCon.do
		
		String context = request.getContextPath();
		// context == /Message
		
		String commandUrl = uri.substring(context.length()+1);
		// commandUrl == LoginCon.do
		
		
		Command con = null;
		
		
		// 요청 url을 따라 서로 다른 클래스를 실행할 수 있게끔 로직 제어
//		if(commandUrl.equals("JoinCon.do")) {
//			con = new JoinCon();
//			// Command가 부모 클래스여서 JoinCon인 자식 클래스가 업캐스팅 하여 자동 형변환 하겠다.
//			// con.execute(request, response);
//			// --> 원래 바로 아래에다 이렇게 하나하나 적었었는데 
//			// --> Command con이라는 규격을 잡아놔서 57줄 처럼 한번만 적어줄 수 있다.
//		}else if(commandUrl.equals("LoginCon.do")) {
//			con = new LoginCon();
//		}else if(commandUrl.equals("LogoutCon.do")) {
//			con = new LogoutCon();
//		}else if(commandUrl.equals("selectCon.do")) {
//			con = new selectCon();
//		}
		// ---> HashMap 사용하면 위 if문 다 필요 없고 82번째 줄만 사용하면 
		
		con = map.get(commandUrl);
		
		con.execute(request, response);
		
		
	}

}
