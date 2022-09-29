package Servlet02;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Login")
public class ex01Login extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// 0. post방식으로 데이터 요청이 들어왔을 때 인코딩하는 방법 
		request.setCharacterEncoding("UTF-8");
		// -----> 클라이언트로부터 요청 받아온 값에 대해서 인코딩 지정
		// get방식은 utf-8로 톰캣에서 이미 지정되어 있고, post방식은 url에 안담기기 때문에 직접 지정해줘야 함
		
		// 1. 요청받은 데이터 꺼내오기
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		
		// 2-1. 출력할 때 한글이 깨지니 인코딩 해줌
		response.setContentType("text/html;charset=UTF-8");
		// -----> 응답을 해 줄 페이지 환경 설정
		
		// 2. 출력할 수 있는 도구 꺼내오기
		PrintWriter out = response.getWriter();
		
		// 3. 출력
		out.print("<h1>");
		out.print(id + "님 환영합니다.");
		out.print("</h1>");
		
	}

}
