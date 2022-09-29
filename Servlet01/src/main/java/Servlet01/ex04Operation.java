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
		
		// ex05Operation.html ���Ͽ�������
		// �����͸� �޾ƿͼ�(input �±� 2��, select 1��)
		// console ���!
		
		int fir = Integer.parseInt(request.getParameter("first"));
		String op = request.getParameter("op");
		int sec = Integer.parseInt(request.getParameter("second"));
		
		System.out.println("ù ��° ���� : " + fir + "\n������ : " + op + "\n�� ��° ���� : " +sec);
		System.out.println("���� ��� : " + fir + op + sec + " = ?");
		
		response.setContentType("text/html;charset=euc-kr");
		
		PrintWriter out = response.getWriter();

		// switch���� ==�� ���ϴµ� String���´� .equals�� ���ؼ� switch�� ��� �Ұ�
		
		out.print("�Է��� ���� ��� : ");
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
