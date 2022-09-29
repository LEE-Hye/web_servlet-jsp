package Servlet01;

import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//1. Url Mapping : url 간략화 가능, 보안
@WebServlet("/Create")
public class ex00Create extends HttpServlet {
	private static final long serialVersionUID = 1L;
	// 2. UID : 클래스 파일이 컴파일되는 과정에서 servlet 명시하는 ID 역할 ----> 지워도 상관 없지만, 가끔 예외상황(예러)이
	// 발생하므로 그대로 두기

	// 3. 기본 생성자
	public ex00Create() {
		super();
		System.out.println("생성자 호출");
	}

	// 4. 초기화 메소드
	public void init(ServletConfig config) throws ServletException {
		System.out.println("Servlet 초기화");
	}

	// 5. 객체 소멸 메소드
	public void destroy() {
		System.out.println("Servlet 소멸");
	}

	// 6. 요청이 들어왔을 때, 실행되는 메소드(서비스제공)
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("service 호출");
	}

	// 7. 요청방식에 따라 실행되는 메소드(get방식, post방식) ----> 우리는 service 하나로 묶어서 사용
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	}

}
