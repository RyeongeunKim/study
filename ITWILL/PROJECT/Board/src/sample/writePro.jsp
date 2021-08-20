<%@page import="com.itwillbs.board.BoardDAO"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>WebContent/board/writePro.jsp</h1>

	<%
	request.setCharacterEncoding("utf-8");
	%>
	
	<jsp:useBean id="bb" class="com.itwillbs.board.BoardBean"/>
	<jsp:setProperty property="*" name="bb"/>
	
	<%
	System.out.println(bb);
	
	//ip정보 추가
	bb.setIp(request.getRemoteAddr());
	
	System.out.println(bb);
	
	//DB에 대한 처리를 하는 객체를 생성
	BoardDAO bdao = new BoardDAO();
	
	//글쓰기 기능을 사용
	bdao.insertBoard(bb);
	
	//페이지 이동
	response.sendRedirect("list.jsp");
	
	
	%>	
</body>
</html>