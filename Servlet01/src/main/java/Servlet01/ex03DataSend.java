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
		// 1. ��û���� ������ ��������
		String id = request.getParameter("id");
		// �н����� ��������
		String pw = request.getParameter("pw");
		
		// 2. ȭ�鿡 h2�±� Ȱ���ؼ� id�� pw ���!
		PrintWriter out = response.getWriter();
		out.print("<h2>");
		out.print("id : " + id + "pw : "+ pw);
		out.print("<br>");
		out.print("</h2>");
		
		// 3. id�� smhrd pw�� 12345�� ��ġ�ϸ� 
		//	  �α��� ����! ���
		
		// �׷��� ���� ��� ���̵�� ��й�ȣ�� Ȯ���ϼ���!
	}

}
