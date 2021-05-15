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
	request.setCharacterEncoding("utf-8"); //한글처리
%>
<!-- 게시글 작성한 데이터를 한번에 읽어들임 -->
<jsp:useBean id="boardbean" class="model.BoardBean">
	<jsp:setProperty name="boardbean" property="*"/>
</jsp:useBean>

<%
	//데이터 베이스 쪽으로 빈클래스를 넘겨줌
	BoardDAO bdao = new BoardDAO();

	//데이터 저장 메소드를 호출
	bdao.insertBoard(boardbean);
	
	//게시글 저장 후 전체 게시글보기
	response.sendRedirect("BoardList.jsp");
	
%>

</body>
</html>