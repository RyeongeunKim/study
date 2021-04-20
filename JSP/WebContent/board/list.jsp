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
  <h1>WebContent/board/list.jsp</h1>
  <%
   // 디비에 저장된 글의 개수를 알기
   
   // BoardDAO 객체 생성
   BoardDAO bdao = new BoardDAO();
   // 디비에 글의 수를 계산하는 메서드 생성 -> 호출
   // getBoardCount();
   int cnt = bdao.getBoardCount();  
  
  %>
  
  
  <h2> ITWILL 게시판 글목록 [총 : <%=cnt %>개] </h2>
  
  



</body>
</html>