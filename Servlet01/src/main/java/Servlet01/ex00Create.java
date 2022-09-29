package Servlet01;

import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// 1. Url Mapping : url ����ȭ ����, ����
@WebServlet("/Create")
public class ex00Create extends HttpServlet {
	private static final long serialVersionUID = 1L;
    // 2. UID : Ŭ���� ������ �����ϵǴ� �������� servlet ����ϴ� ID ���� ----> ������ ��� ������, ���� ���ܻ�Ȳ(����)�� �߻��ϹǷ� �״�� �α�
    
	
	// 3. �⺻ ������
    public ex00Create() {
        super();
        System.out.println("������ ȣ��");
    }

    // 4. �ʱ�ȭ �޼ҵ�
	public void init(ServletConfig config) throws ServletException {
		System.out.println("Servlet �ʱ�ȭ");
	}

	// 5. ��ü �Ҹ� �޼ҵ�
	public void destroy() {
		System.out.println("Servlet �Ҹ�");
	}

	// 6. ��û�� ������ ��, ����Ǵ� �޼ҵ�(��������)
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("service ȣ��");
	}

	// 7. ��û��Ŀ� ���� ����Ǵ� �޼ҵ�(get���, post���) ----> �츮�� service �ϳ��� ��� ���
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}
