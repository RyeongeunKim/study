<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<body>

<h2> 세션 로그인 처리1 </h2>

<%
	request.setCharacterEncoding("utf-8");

	//사용자로부터 데이터를 읽어드림
	String id = request.getParameter("id");
	String pass = request.getParameter("pass");
	
	//아이디와 패스워드를 저장
	session.setAttribute("id", id);
	session.setAttribute("pass", pass);
	
	//세션의 유지시간 설정
	session.setMaxInactiveInterval(60*2); //2분간 아이디 유지
	
	response.sendRedirect("SessionMain.jsp");
%>


</body>
</html>