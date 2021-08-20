<%@page import="model.BoardDAO"%>
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
%>
<!-- 데이터를 한번에 받아오는 빈클래스를 사용하도록 -->
<jsp:useBean id="boardbean" class="model.BoardBean">
	<jsp:setProperty name="boardbean" property="*"/>
</jsp:useBean>

<%
	//데이터베이스 객체 생성
	BoardDAO bdao = new BoardDAO();
	bdao.reWriteBoard(boardbean);
	
	//답변 데이터를 모두 저장 후 전체 게시글 보기를 설정
	response.sendRedirect("BoardList.jsp");
%>


</body>
</html>