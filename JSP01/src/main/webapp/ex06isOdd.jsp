<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>홀수 구하기</title>
</head>
<body>

	<%
		int num1 = 10;
		int num2 = 21;
		int sum = num1 + num2;
		
		if(Odd(sum)){
			%>
	<h1>sum은 짝수 입니다.</h1>

	<%}else{ %>
	<h1>sum은 홀수입니다.</h1>
	<%}%>


	<h1>
		sum은
		<%=sum %>로
		<%=isOdd(sum) %>입니다.
	</h1>

	<%!
	
		private boolean Odd(int num){
		return num % 2 == 0;
	}
	
	
		private String isOdd(int num){
		if(num % 2 == 0){
			return "짝수";
		}
		else{
			return "홀수";
		}
	}
	%>




</body>
</html>