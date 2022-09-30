<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>선언문 예시</title>
</head>
<body>

	<!-- 메소드와 num1이 전역변수로 선언되어 있기 때문에
		 우리 눈에는 코드가 더 아래에 있어서 사용 불가능해보이지만,
		 프로그램이 동작하는 방식에 있어서는 문제가 없다
	 -->
	 
	<%=add(num1, 4) %>

	<!-- 3. 선언문 -->
	<!-- : .java로 변환될 때 전역변수로 선언된다. -->
	<%! 
		int num1 = 10;
		private int add(int num1, int num2){
			return num1 + num2;
		}
	%>
	
</body>
</html>