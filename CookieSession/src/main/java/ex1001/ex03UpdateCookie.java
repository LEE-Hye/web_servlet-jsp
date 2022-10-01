package ex1001;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ex03UpdateCookie")
public class ex03UpdateCookie extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// 쿠키 수정
		// 이름만 동일하게 주면 덮어쓰기가 일어나 수정이 가능
		Cookie first = new Cookie("first_item", "firstCookie");
		
		// 쿠키 유효기간 설정
		// 쿠키 유효기간 default :  Session(브라우저가 열려있는 동안)
		// setMaxAge(유효기간(단위:초));
		first.setMaxAge(1*3600*24*365);
		
		response.addCookie(first);
		
		// 쿠키 삭제
		Cookie second = new Cookie("second_item", "");
		
		// 유효기간 0으로 설정
		second.setMaxAge(0);
		
		response.addCookie(second);
		
		response.sendRedirect("ex02showCookie.jsp");
	}

}
