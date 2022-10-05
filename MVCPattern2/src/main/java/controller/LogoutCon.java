package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/LogoutCon")
public class LogoutCon extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// 1. 세션 꺼내오기
		HttpSession session = request.getSession();
		
		// 2. 세션 값 삭제하기
		// removeAttribute("name값") : session안에 들어있는 name값에 들어있는 정보만 삭제
		// invalidate : session안에 들어있는 모든 정보 삭제
		session.invalidate();
		
		// 3. Main.jsp로 이동!
		response.sendRedirect("Main.jsp");

	}

}
