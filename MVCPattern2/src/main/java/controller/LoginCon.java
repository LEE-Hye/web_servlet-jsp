package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.AiMember;
import model.DAO;

@WebServlet("/LoginCon")
public class LoginCon extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// Controller역할을 담당!

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
		if (resultVo != null) {

			// 6-2. 사용자 정보를 session 객체 바인딩
			// servlet에서는 session은 내장 객체가 아니다!
			HttpSession session = request.getSession(); 
			// HttpSession은 인터페이스다!
			// (추상 메소드를 가지고 있다.. ---> 오버라이딩 해야한다.)
			// new 키워드를 사용해서 생성하지 않고, 요청 정보를 가지고 있는
			// request를 활용해서 생성한다!
			
			session.setAttribute("name", resultVo.getName());

			response.sendRedirect("LoginSuccess.jsp");
		} else {
			response.sendRedirect("LoginFail.jsp");
		}
		
	}

}
