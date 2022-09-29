package Servlet01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Table")
public class ex02Table extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();

		out.print("<table border = 'soild 1px'");
		for (int n = 3; n < 7; n++) {
			out.print("<tr bgcolor='#A084CA'>");
			for (int i = 1; i < 10; i++) {
				out.print("<td style='color:#fff;'>" + n + "*" + i + "=" + (n * i) + "</td>");
			}
			out.print("</tr>");
		}
		out.print("</table>");

	}

}
