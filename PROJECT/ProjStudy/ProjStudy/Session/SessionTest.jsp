<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h2> 세션 연습 </h2>

<%
	String name = "shin";
	//세션을 이용하여 데이터를 유지
	session.setAttribute("name1", name);
	//세션유지시간
	session.setMaxInactiveInterval(10); //10초간 세션을 유지
%>

	<a href="SessionName.jsp">세션네임페이지로이동</a>
	
	
</body>
</html>