<%@page import="com.itwillbs.board.BoardDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
request.setCharacterEncoding("utf-8");
System.out.print(request.getParameter("re_ref"));
%>
	<h1>WebContent/board/reWritePro.jsp</h1>
	<jsp:useBean id="bb" class="com.itwillbs.board.BoardBean"></jsp:useBean>
	<jsp:setProperty property="*" name="bb"/>
	
	<%
	System.out.print(bb);
	
	//글쓴이의 IP주소를 추가적으로 저장
	bb.setIp(request.getRemoteAddr());
	
	//BoardDAO 객체 생성
	BoardDAO bdao = new BoardDAO();
	
	//답글 작성 메서드 - reInsertBoard(bb);
	bdao.reInsertBoard(bb);
	
	response.sendRedirect("list.jsp");
	%>
</body>
</html>