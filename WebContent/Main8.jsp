<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset='UTF-8'>
<title>Insert title here</title>
</head>
<body>
<%
	for(int i = 0; i < 10; i++) {
		response.getWriter().print("안녕하세요.");
	}
%>
</body>
</html>