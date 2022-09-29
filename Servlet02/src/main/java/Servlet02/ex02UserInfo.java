package Servlet02;

import java.io.IOException;
import java.util.Arrays;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/UserInfo")
public class ex02UserInfo extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// 0. post방식이므로 한글 인코딩 잡아주기
		request.setCharacterEncoding("UTF-8");
		
		// 1. 데이터 꺼내오기
		String job = request.getParameter("job");
		String gender = request.getParameter("gender");
		String[] hobby = request.getParameterValues("hobby");
		
		System.out.println(job);
		System.out.println(gender);
		// Arrays.toString(레퍼런스 변수);
		// -----> 배열 안에 있는 데이터들을 전부 리턴
		// ex) [축구, 야구, 농구]
		System.out.println(Arrays.toString(hobby));
		
	}

}
