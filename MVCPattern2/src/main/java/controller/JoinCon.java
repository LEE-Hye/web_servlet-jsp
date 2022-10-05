package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.AiMember;
import model.DAO;

@WebServlet("/JoinCon")
public class JoinCon extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// Controller역할을 담당!
		
		// 1. (post로 보내와서 깨질 수 있으니) 한글 인코딩 잡아주기
		request.setCharacterEncoding("UTF-8");
	
		// 2. id값 꺼내오기
		String id = request.getParameter("id");
		
		// 3. 요청받은 값 전부 꺼내오기
		String pw = request.getParameter("pw");
		String name = request.getParameter("name");
		int age = Integer.parseInt(request.getParameter("age"));
		
		// 4. 데이터들을 사용자 정의 자료형(AiMember)으로 하나로 묶어주기
		AiMember vo = new AiMember(); // --> 객체 생성
		vo.setId(id); // --> setter 메소드 사용하여 데이터 바인딩
		vo.setPw(pw);
		vo.setName(name);
		vo.setAge(age);
		
		// 5. 데이터 베이스에 값을 추가하기
		DAO dao = new DAO();
		// 서로 다른 클래스 파일간의 값을 주고 받으려면 매개변수와 리턴 타입을 활용해야 한다.
		// JoinProgram.jsp --vo값을 전달--> DAO
		//					dao.join(vo)
		int result = dao.join(vo);
		
		// 6. 흐름 제어
		if(result > 0){
			
			// 6-1) request영역에 id값 저장하기
			request.setAttribute("id", id);
			
			// 6-2) forward방식 활용해서 Login.jsp이동
			// forward 방식은 url 위치가 바뀌지 않는다
			RequestDispatcher rd = request.getRequestDispatcher("Login.jsp");
			
			rd.forward(request, response);
			
		}else{
			// Join.jsp 이동
			response.sendRedirect("Join.jsp");
		}
		
	}

}
