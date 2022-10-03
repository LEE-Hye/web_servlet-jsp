package ex1001;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/ex07UpdateSession")
public class ex07UpdateSession extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// 세션 받아오기
		HttpSession session = request.getSession();
		
		// 기존에 있었던 session과 동일한 이름을 주면
		// 덮어쓰기가 된다.
		session.setAttribute("str", "스마트 인재 캠퍼스");
		
		// 세션에 저장된 데이터 삭제
		// 세션은 값이 없으면 무조건 null을 돌려주게 되어 있다.
		// .removeAttribute("세션이름");
		session.removeAttribute("list");
		
//		session.invalidate(); -> 얘도 삭제하는 앤데 데이터를 삭제하는게 아닌 세션자체를 없애버림
		
		response.sendRedirect("ex06showSession.jsp");
	}

}