package Servlet01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/DataSend")
public class ex03DataSend extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 1. 요청받은 데이터 꺼내오기
		String id = request.getParameter("id");
		// 패스워드 꺼내오기
		String pw = request.getParameter("pw");
		
		// 2. 화면에 h2태그 활용해서 id와 pw 출력!
		PrintWriter out = response.getWriter();
		out.print("<h2>");
		out.print("id : " + id + "pw : "+ pw);
		out.print("<br>");
		out.print("</h2>");
		
		// 3. id가 smhrd pw가 12345와 일치하면 
		//	  로그인 성공! 출력
		
		// 그렇지 않은 경우 아이디와 비밀번호를 확인하세요!
	}

}
