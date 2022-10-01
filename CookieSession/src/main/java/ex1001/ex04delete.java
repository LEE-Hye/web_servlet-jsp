package ex1001;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ex04delete")
public class ex04delete extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		// 나중에 만들 수 있을 때 반복문으로 만들어보자
		
		Cookie mou = new Cookie("mouse_item","");
		Cookie com = new Cookie("com_item","");
		Cookie pho = new Cookie("phone_item","");
		
		mou.setMaxAge(0);
		com.setMaxAge(0);
		pho.setMaxAge(0);
		
		response.addCookie(mou);
		response.addCookie(com);
		response.addCookie(pho);
		
		response.sendRedirect("ex04list.jsp");
	}

}
