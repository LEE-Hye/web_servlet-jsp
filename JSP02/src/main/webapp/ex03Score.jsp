<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
td{
	width:80%;
}
tbody {
    width: 100%;
}
</style>
</head>
<body>

	<%
	// 0. post방식으로 받아왔으니까 인코딩 잡아주기
	request.setCharacterEncoding("UTF-8");
	// 1. 요청받은 데이터 가져오기
	String name = request.getParameter("name");
	int java = Integer.parseInt(request.getParameter("java"));
	int web = Integer.parseInt(request.getParameter("web"));
	int iot = Integer.parseInt(request.getParameter("iot"));
	int android = Integer.parseInt(request.getParameter("android"));
	
	// 2. 데이터를 가지고 평균 구하기
	int avg = (java + web + iot + android)/4;

	// 3. 학점 구하기
	String score = "";

	if(avg >= 95){
	score = "A+";
	}
	else if(avg >= 90){
		score="A";
	}
	else if(avg >= 85){
		score="B+";
	}
	else if(avg >= 80){
		score="B";
	}
	else{
		score="F";
	}
	%>

<fieldset>
	<legend>학점확인프로그램</legend>
	<table align="center">
		<tr>
			<td>이름</td>
			<td><%=name %></td>
		</tr>
		<tr>
			<td>JAVA점수</td>
			<td><%=java %></td>
		</tr>
		<tr>
			<td>WEB점수</td>
			<td><%=web %></td>
		</tr>
		<tr>
			<td>IOT점수</td>
			<td><%=iot %></td>
		</tr>
		<tr>
			<td>ANDROID점수</td>
			<td><%=android %></td>
		</tr>
		<tr>
			<td>평균</td>
			<td>
			<%=avg %>
			</td>
		</tr>
		<tr>
			<td>학점</td>
			<td> 
			<strong>
			<%=score %>
			</strong>
			</td>
		</tr>
	</table>
</fieldset>
</body>
</html>