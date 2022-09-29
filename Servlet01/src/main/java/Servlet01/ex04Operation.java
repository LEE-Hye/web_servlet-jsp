package Servlet01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Operation")
public class ex04Operation extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// ex05Operation.html 파일에서부터
		// 데이터를 받아와서(input 태그 2개, select 1개)
		// console 출력!
		
		int fir = Integer.parseInt(request.getParameter("first"));
		String op = request.getParameter("op");
		int sec = Integer.parseInt(request.getParameter("second"));
		
		System.out.println("첫 번째 숫자 : " + fir + "\n연산자 : " + op + "\n두 번째 숫자 : " +sec);
		System.out.println("연산 결과 : " + fir + op + sec + " = ?");
		
		response.setContentType("text/html;charset=euc-kr");
		
		PrintWriter out = response.getWriter();

		// switch문은 ==로 비교하는데 String형태는 .equals로 비교해서 switch문 사용 불가
		
		out.print("입력한 연산 결과 : ");
		out.print(fir + op + sec + " = ");
		if(op.equals("+")) {
			out.print(fir + sec);
		}else if(op.equals("-")){
			out.print(fir - sec);
		}else if(op.equals("*")) {
			out.print(fir * sec);
		}else if(op.equals("/")) {
			out.print(fir / sec);
		}
	}

}
