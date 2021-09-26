<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<%
		String id = (String)session.getAttribute("id");
	%>
	
	<h1>메인페이지</h1>
	
	<%
		if(session.getAttribute("id") == null){
	%>
		<a href="login">로그인</a><br>
		<a href="join">회원가입</a>	
	<%} %>
	
	<%
		if(id != null && id.equals("admin")){
	%>
		<a href="userList">회원목록</a><br>
	<%} %>
	
	<%
		if(session.getAttribute("id") != null){
	%>
		<a href="./logout" class="m-2">로그아웃</a>
	<%} %>

</body>
</html>