<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<center>
	<h2> 세션 로그인 처리 1 </h2>
	
	<% 
		request.setCharacterEncoding("UTF-8");
		
		//사용자로 부터 데이터를 읽어드림 
		String id= request.getParameter("id");	
		String pass = request.getParameter("pass");
		
		//아이디와 패스워드를 저장 
		session.setAttribute("id",id);
		session.setAttribute("pass",pass);
		
		//세션 유지 시간 설정 
		session.setMaxInactiveInterval(60);
	%>
	
	<h2>당신의 아이디는 <%=id%> 입니다. 패스 워드는<%=pass%>입니다 </h2>
	
	<!--  
		<a href = "SessionLoginProc2.jsp?id=<%=id%>&pass=<%=pass%>">다음 페이지로 이동</a>
	-->
	<a href = "SessionLoginProc2.jsp">다음 페이지로 이동</a>
</center>

</body>
</html>