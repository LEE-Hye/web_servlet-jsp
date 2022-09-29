package Servlet01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Print")
public class ex01Print extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// java main method 역할
		
		// request : 클라이언트 요청에 대한 정보가 들어있는 객체
		// response : 응답에 대한 정보가 들어있는 객체
		
		// ★★★★★ 요청이 들어오면 반드시 응답해줘야한다 ★★★★★
		
		// 2. 한글 인코딩 잡아주기 ----> 반드시 out 객체를 생성하기 전에 인코딩 변경해주기
		response.setContentType("text/html;charset=euc-kr");
		
		// 1. 웹페이지 출력
		// 1-1) 웹페이지 출력을 도와주는 도구 꺼내오기
		PrintWriter out = response.getWriter();
		
		// 1-2 도구 사용하기
		out.print("<h1>hello world</h1>");
		
		// 반복문을 활용해서 코드를 수정
		// 팀원 이름을 하나로 묶는 배열 생성
		String [] names = {"신명호","김명현","이혜빈","나소영"};
		
		// 팀원 이름을 순서가 없는 리스트 형태로 출력
		
		out.print("<ul>");
		for(int i = 0; i< names.length;i++) {
			out.print("<li>"+names[i]+"</li>");	
		}
		out.print("</ul>");
	}

}
