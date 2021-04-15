<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h1>WebContent/member/main.jsp</h1>
	
	<%
	  // 사용자가 로그인을 했을때만 main페이지 확인
	  // 로그인 안한경우 로그인 페이지로 이동
	  
	  // 세션객체의 정보를 가져와서 확인
	  String id = (String) session.getAttribute("id");
	
	  if(id == null){
		  // 로그인 x
		  System.out.println("[main.jsp] : 아이디없음 -> 로그인페이지 이동");
		  response.sendRedirect("loginForm.jsp");
	  }
	  
	%>
	
	<h2><%=id %>님 환영합니다~!</h2>
	
	<input type="button" value="로그아웃!" 
	   onclick=" location.href='logout.jsp'; "
	>
	<hr>
	
	<h3><a href="info.jsp">회원 정보 조회</a></h3>
	
	
	<h3><a href="updateForm.jsp">회원 정보 수정</a></h3>
	
	
	
	
	
	
	
	
	
	
	
	

</body>
</html>