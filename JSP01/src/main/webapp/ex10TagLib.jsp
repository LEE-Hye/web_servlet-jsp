<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!-- 태그라이브러리란?
     : html태그와 같이 정해져있는 태그가 아니라,
       다른 사람이 개발해 놓은 혹은 정의해 놓은 기능을 가지고 있는 태그를 제공해주는 라이브러리-->
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>지시자로 라이브러리 사용</title>
</head>
<body>

	<c:set var = "num1" value="4"/>
	${num1 }
	

</body>
</html>