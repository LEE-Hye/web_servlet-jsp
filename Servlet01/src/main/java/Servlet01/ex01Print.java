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
		// java main method ����
		
		// request : Ŭ���̾�Ʈ ��û�� ���� ������ ����ִ� ��ü
		// response : ���信 ���� ������ ����ִ� ��ü
		
		// �ڡڡڡڡ� ��û�� ������ �ݵ�� ����������Ѵ� �ڡڡڡڡ�
		
		// 2. �ѱ� ���ڵ� ����ֱ� ----> �ݵ�� out ��ü�� �����ϱ� ���� ���ڵ� �������ֱ�
		response.setContentType("text/html;charset=euc-kr");
		
		// 1. �������� ���
		// 1-1) �������� ����� �����ִ� ���� ��������
		PrintWriter out = response.getWriter();
		
		// 1-2 ���� ����ϱ�
		out.print("<h1>hello world</h1>");
		
		// �ݺ����� Ȱ���ؼ� �ڵ带 ����
		// ���� �̸��� �ϳ��� ���� �迭 ����
		String [] names = {"�Ÿ�ȣ","�����","������","���ҿ�"};
		
		// ���� �̸��� ������ ���� ����Ʈ ���·� ���
		
		out.print("<ul>");
		for(int i = 0; i< names.length;i++) {
			out.print("<li>"+names[i]+"</li>");	
		}
		out.print("</ul>");
	}

}
